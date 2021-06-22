package arraywithstackoperations;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();

        int[]arr = {2,3,4,5,8,9,10};

        System.out.println(buildArray(arr,10));
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int x = 1;
        int i = 0;

        while (i < target.length) {
            result.add("Push");
            if (target[i] != x) {
                result.add("Pop");
                i--;
            }
            x++;
            i++;
        }

        return result;


    }



}








