package thirdmaximumelement;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2};

        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                thirdMax = secondMax;
                secondMax = max;
                max = nums[i];
            } else if (nums[i] > secondMax && nums[i] < max) {
                thirdMax = secondMax;
                secondMax = nums[i];

            } else if (nums[i] > thirdMax && nums[i] < secondMax) {
                thirdMax = nums[i];
            }

        }


        return thirdMax==Integer.MIN_VALUE?max:thirdMax;
    }

}
