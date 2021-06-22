package happynumber;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class app {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n!=1) {
         if(set.contains(check(n))){
             return false;
         }else{
             set.add(n);
         }
            n=check(n);
        }
        return true;
    }

    public static int check(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;

    }

}

