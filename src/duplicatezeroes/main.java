package duplicatezeroes;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(nums);
    }

    public static void duplicateZeros(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros2(int[] arr) {
        int z = 0;
        for (int a : arr) {
            if (a == 0) {
                z++;
            }
        }

        int n = arr.length;

        for (int i = n - 1; i >= 0; i--) {

            if (i + z < arr.length) {
                arr[i + z] = arr[i];

            }

            if (arr[i] == 0) {
                z -= 1;
                if (i + z < arr.length) {
                    arr[i + z] = arr[i];

                }

            }


        }

        System.out.print(Arrays.toString(arr));

    }


}



