package numbersdissapearedinarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        int[] myArray = {3, 4, 6, 2, 1, 5, 3 ,2 };
        System.out.println(findDisappearedNumbers(myArray));

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        while (i < nums.length) {

            int j = nums[i] - 1;
            if (nums[i] != nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
           if(nums[i]!=i+1){
               System.out.println(i+1);
           }
        }
        return res;
    }


}

