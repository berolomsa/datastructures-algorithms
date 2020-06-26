package arrays;

import java.util.Arrays;

public class IncrementArrayAsInteger {
    public static void main(String[] args) {
        int[] array = new int[]{9, 9, 9};

        System.out.println(Arrays.toString(incrArray(array)));
    }

    private static int[] incrArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        int indx = array.length - 1;
        int carry = 1;
        while (indx != -1) {
            if (array[indx] + carry == 10) {
                carry = 1;
                newArray[indx + 1] = 0;
            } else {
                newArray[indx + 1] = array[indx] + carry;
                carry = 0;
            }
            indx--;
        }
        if (carry == 1) {
            newArray[0] = 1;
        }
        if (newArray[0] == 0) {
            return Arrays.copyOfRange(newArray, 1, newArray.length);
        } else {
            return newArray;
        }
    }
}
