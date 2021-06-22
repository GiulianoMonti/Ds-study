package replaceelementswithgreatestelementonrightside;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        int arr[] = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));

    }

    public static int[] replaceElements(int[] arr) {

        int end = arr.length;
        int max = arr[end-1];

        for (int i =end- 2; i >= 0; i--) {
            int temp = arr[i];

                arr[i]=max;

            max = Math.max(max, temp);

        }
        arr[arr.length-1] = -1;

        return arr;

    }

}


