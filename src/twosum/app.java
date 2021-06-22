package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 7, 11, 15};
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int target = 10;
        System.out.println((Arrays.toString(twoSum(nums, target))));
    }

    public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();



            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("no match found");
        }
    }



