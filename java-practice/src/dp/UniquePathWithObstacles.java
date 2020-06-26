package dp;

public class UniquePathWithObstacles {
    public static void main(String[] args) {
        int[][] obst = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        uniquePathsWithObstacles(obst);
    }
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        boolean blocked = false;
        for (int i=0; i<obstacleGrid.length; i++) {
            if (obstacleGrid[i][0] != 1 && !blocked) {
                obstacleGrid[i][0] = 1;
            } else {
                blocked = true;
                obstacleGrid[i][0] = 0;
            }
        }
        blocked = false;
        for (int i=1; i<obstacleGrid[0].length; i++) {
            if (obstacleGrid[0][i] != 1 && !blocked) {
                obstacleGrid[0][i] = 1;
            } else {
                blocked = true;
                obstacleGrid[0][i] = 0;
            }
        }

        for (int i=1; i<obstacleGrid.length; i++) {
            for (int j=1; j<obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
                System.out.println(obstacleGrid[i][j]);
            }
        }

        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length -1];
    }
}
