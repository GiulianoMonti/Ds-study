package findlengthcontinousincreasingsubsequence;

public class app {
    public static void main(String[] args) {
        int[] a = {1,3,5,4,7};
        System.out.println(findLengthOfLCIS(a));
    }

    public static int findLengthOfLCIS(int[] nums) {

        int ancla = 0, maxSum = 0;


        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i]) {
                ancla = i;

            }else{
                ancla+=1;
            }
            maxSum = Math.max(maxSum, ancla);
        }

//        for (int i = 0; i < nums.length; i++) {
//            if (i > 0 && nums[i - 1] >= nums[i]) {
//                ancla = i;
//            }
//            maxSum = Math.max(maxSum, i - ancla + 1);
//        }

        return maxSum;
    }
}

//
//        for (int i = 0; i < 4; i++) {
//            windowSum += nums[i];
//        }
//        for ( int end = 4; end < nums.length;end++){
//            windowSum+= nums[end] - nums[end -3];
//            maxSum = Math.max(maxSum,windowSum);
//        }
//        return maxSum;


//        for (int i = 0;i<nums.length -3 ;i++) {
//            int wSum = 0;
//            for(int j = i; j<i+3;j++){
//                wSum+=nums[j];
//            }
//            mSum = Math.max(mSum,wSum);
//        }






