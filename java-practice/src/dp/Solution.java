package dp;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        pacificAtlantic(new int[][]{{1,1},{1,1},{1,1}});
    }
    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Boolean[][] cachePacific = new Boolean[matrix.length][matrix[0].length];
        Boolean[][] cacheAtlantic = new Boolean[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if (dfs(matrix,i,j, false, cachePacific) && dfs(matrix,i,j, true, cacheAtlantic)) {
                    List<Integer> result = new ArrayList<>();
                    result.add(i);
                    result.add(j);
                    res.add(result);
                }
            }
        }
        return res;
    }

    private static int[][] dirs = new int[][]{{0,1}, {0,-1}, {-1,0}, {1,0}};

    public static boolean dfs(int[][] matrix, int i, int j, boolean isAtlantic, Boolean[][] cache) {
        if (cache[i][j] != null) return cache[i][j];
        int val = matrix[i][j];

        matrix[i][j] = -1;
        boolean res = false;
        for (int[] dir : dirs) {
            int row = i+dir[0];
            int col = j+dir[1];
            if (inBound(row,col, matrix)) {
                if (matrix[row][col] == -1) continue;
                if (val >= matrix[row][col])
                    res |= dfs(matrix,row,col,isAtlantic, cache);
            } else {
                if (col >= matrix[0].length || row >= matrix.length) res|= isAtlantic;
                if (row < 0 || col < 0) res|= !isAtlantic;
            }
        }
        cache[i][j] = res;
        matrix[i][j] = val;
        return res;
    }

    public static boolean inBound(int row, int col, int[][] matrix) {
        return row >=0 && col>=0 && row < matrix.length && col < matrix[0].length;
    }
}
