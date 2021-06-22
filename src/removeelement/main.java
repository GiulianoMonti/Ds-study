package removeelement;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {3,2,2,3};

        System.out.println(removeElement(arr, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] != val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}

