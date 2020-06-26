package hashtables;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayDistinctElements {
    public static void main(String[] args) {
        String[] arr = new String[]{"f","s","f","e","t","w","e","n","w","e"};
        int start = 0;
        int end = -1;
        int longest = Integer.MIN_VALUE;
        int longestSt = -1;
        int longestEnd = -1;
        Map<String, Integer> strintToindexMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (strintToindexMap.containsKey(arr[i])) {
                if (end - start > longest) {
                    longest = end-start;
                    longestSt = start;
                    longestEnd = end;
                }
                start = strintToindexMap.get(arr[i])+1;
                strintToindexMap.remove(arr[i]);
                strintToindexMap.put(arr[i], i);
            } else {
                end = i;
                strintToindexMap.put(arr[i], i);
            }
        }
        System.out.println(longest+1);
        System.out.println(longestSt + " " + longestEnd);
    }
}
