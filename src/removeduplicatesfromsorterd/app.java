package removeduplicatesfromsorterd;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int[]arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
            int a= 0;

           for(int i = 1;i <nums.length;i++){
               if(nums[a]!=nums[i]){
                   a++;
                   nums[a]=nums[i];

               }

        }

        return a+1;
    }
}

