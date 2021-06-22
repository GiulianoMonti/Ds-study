package maximumsubarray;

public class App {
    public static void main(String[] args) {
        int[] b = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(b));
    }
    public static int maxSubArray(int[] nums) {
        int a = 0;
        int b = Integer.MIN_VALUE;
        for (int num : nums) {
            a += num;
            if (a > b) {
                b = a;
            }
            if (a < 1) {
                a = 0;
            }
        }
        return b;
    }
}


