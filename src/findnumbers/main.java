package findnumbers;

public class main {
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int digits = 0;

        for (Integer n : nums) {
            if(String.valueOf(n).length()%2==0){
                digits++;
            }else{

            }
        }

        return digits;
    }
}

