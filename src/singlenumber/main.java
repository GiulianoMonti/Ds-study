package singlenumber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        int[] a = {1, 2, 1, 2, 4};
        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();


        for(Integer n : nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        for(Integer i : set){
            nums[0]=i;
        }

        return nums[0];
    }
}

