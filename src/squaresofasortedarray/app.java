package squaresofasortedarray;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        //result array
        //pointers for left and right
        int left = 0;
        int right = nums.length - 1;
        //iterate from n to 0
        for (int i = nums.length - 1; 0 <= i; i--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                res[i]=nums[left]*nums[left];
                left++;
            }else{
                res[i]=nums[right]*nums[right];
                right--;
            }
        }

        //check if abs left is less than or equal to abs right
        //add left squared to result array
        //increment left pointer
        //add right squared to result array
        //decrement right pointer

        //result


        return res;
    }
}

//result array
//pointers for left and right
//iterate from n to 0
//check if abs left is less than or equal to abs right
//add left squared to result array
//increment left pointer
//add right squared to result array
//decrement right pointer

//result

