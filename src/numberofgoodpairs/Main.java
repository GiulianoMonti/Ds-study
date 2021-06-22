package numberofgoodpairs;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 1, 1, 3, 3};
        System.out.print(numIdenticalPairs(a));
    }

    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        int[] c = new int[101];

        for (int n : nums)
            res += c[n]++;

        return res;

    }
}

