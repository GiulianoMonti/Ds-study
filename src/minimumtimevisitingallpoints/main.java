package minimumtimevisitingallpoints;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2},
                     {3, 4},
                {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(arr));
    }

    public static int minTimeToVisitAllPoints(int[][] p) {
        int counter = 0;
        for (int i = 0; i < p.length-1; i++) {
            int[] first = p[i];
            int[] second = p[i + 1];
            int diffX = Math.abs(first[0] - second[0]); //2 || 2
            int diffY = Math.abs(first[1] - second[1]); //2 || 4
            counter += Math.max(diffX, diffY); //2+4

        }


        return counter;
    }


}

