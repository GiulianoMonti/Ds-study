package heightchecker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class app {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {5, 1, 2, 3, 4};
        int c[] = {2, 1, 2, 1, 1, 2, 2, 1};
        int n = 10;
        n--;
        System.out.println(n++);
//        System.out.println(heightChecker(a));
        System.out.println(heightChecker(b));
//        System.out.println(heightChecker(c));
    }

    public static int heightChecker(int[] heights) {

        int[] heightToFreq = new int[101];

        for (int height : heights) {
            heightToFreq[height]++;
        }

        int result = 0;
        int curHeight = 0;

        for (int i = 0; i < heights.length; i++) {
            while (heightToFreq[curHeight] == 0) {
                curHeight++;
            }

            if (curHeight != heights[i]) {
                result++;
            }
            heightToFreq[curHeight]--;
        }

        return result;
    }
}