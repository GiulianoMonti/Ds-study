package maxconsecutiveones;

public class app {
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int temp = 0;
        for (Integer n : nums) {
            if (n == 1) {
                sum++;
            }
            temp = Math.max(temp, sum);
            if (n == 0) {
                sum = 0;
            }
        }
        return temp;
    }
}