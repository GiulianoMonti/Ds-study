package mergesortedarray;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        int n = 3;
        int m = 3;
        merge(nums1, n, nums2, m);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = 0;
        int q = nums1.length - 1;
        m--;
        n--;

        for (int i = nums1.length-1; i >= 0; i--) {
            if ( n < 0) {
                break;
            }

            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[i] = nums1[m];
                m--;
            } else {
                nums1[i] = nums2[n];
                n--;
            }

        }
        System.out.println(Arrays.toString(nums1));

    }

}



