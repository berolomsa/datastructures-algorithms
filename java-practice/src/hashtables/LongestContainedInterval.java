package hashtables;

import java.util.Arrays;
import java.util.HashSet;

public class LongestContainedInterval {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>(Arrays.asList(-3, -2, 7, 9, 8, 1, 2, 0, -1, 5, 8, -5));
        int longest = Integer.MIN_VALUE;
        int longestLeft = -1;
        int longestRight = -1;
        while (!a.isEmpty()) {
            int num = a.iterator().next();
            a.remove(num);
            int left = num-1;
            while (a.contains(left)) {
                a.remove(left);
                left--;
            }
            int right = num+1;
            while (a.contains(right)) {
                a.remove(right);
                right++;
            }
            right--;
            left++;
            if (right - left > longest) {
                longest = right-left;
                longestLeft = left;
                longestRight = right;
            }
        }
        System.out.println(longest+1);
        System.out.println(longestLeft);
        System.out.println(longestRight);
    }
}
