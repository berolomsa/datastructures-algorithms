package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        List<List<Integer>> permutations = new ArrayList<>();
        permute(permutations, list, new ArrayList<>());
        for (List<Integer> a: permutations) {
            System.out.println(a.toString());
        }
    }

    private static void permute(List<List<Integer>> permutations, List<Integer> list, List<Integer> result) {
        if (list.size() == 0) {
            permutations.add(new ArrayList<>(result));
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i));
            List<Integer> a = new ArrayList<>(list);
            a.remove(i);
            permute(permutations, a, result);
            result.remove(list.get(i));
        }
    }
}
