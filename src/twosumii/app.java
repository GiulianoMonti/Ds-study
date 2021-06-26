package twosumii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        int[] nums = {2,3,4};

        int target = 6;
        System.out.println((Arrays.toString(twoSum(nums, target))));
    }

    public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    return new int[]{map.get(target - nums[i]), i+1};
                }
                map.put(nums[i], i+1);
            }
            throw new IllegalArgumentException("no match found");
        }
    }



