package decompressrunlengthencodedlist;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] a = {42, 39};
        System.out.println(Arrays.toString(decompressRLElist(a)));

    }

    public static int[] decompressRLElist(int[] nums) {


        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];

        }
        int k=0;
        int[] copy = new int[size];
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                copy[k++] = nums[i + 1];
            }
        }


        return copy;

        //

    }

}
