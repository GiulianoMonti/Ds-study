package sortarraybyparity;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int arr[] = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    public static int[] sortArrayByParity(int[] A) {
        int start = 0;
        int end = A.length - 1;
        while (start < end) {
            if (A[start] % 2 == 0) {
                start++;
            } else if (A[end] % 2 == 0) {
                int t = A[end];
                A[end] = A[start];
                A[start] = t;
                end--;
            }
        }

        return A;
    }
}

