package smallerthanthecurrentnumber;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        int[] a = {8, 1, 2, 2, 3};
        System.out.print((Arrays.toString(smallerNumbersThanCurrent(a))));
    }

//    Create a copy of the input array. copy = [8,1,2,2,3]
//    Sort the copy array. copy = [1,2,2,3,8]
//    Fill the map: number => count (where count is an index in sorted array, so first number with index 0 has 0 numbers less than it, index 1 has 1 number less, etc). We update only first time we enocunter the number so that way we skip duplicates.
//    map[1]=>0
//    map[2]=>1
//    map[3]=>3
//    map[8]=>4
//    We re-use our copy array to get our result, we iterate over original array, and get counts from the map.
//      [4,0,1,1,3]


    public static int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        Arrays.sort(copy);
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=map.get(nums[i]);
        }

        return nums;
    }
}
