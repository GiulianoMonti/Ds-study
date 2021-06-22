package plusone;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 9, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    public static int[] plusOne(int[] digits) {

        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] + carry > 9) {
                digits[i] = 0;

            } else {
                digits[i]+=carry;
                carry = 0;

            }

        }

        return digits;
    }
}

