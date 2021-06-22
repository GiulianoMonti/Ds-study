package stringtointegeratoi;

public class main {
    public static void main(String[] args) {
        String s = "   ";
        System.out.println(myAtoi(s));

    }

    public static int myAtoi(String s) {
        int res = 0;
        int i = 0;
        int sign = 1;


        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }

        if (s.charAt(i) == '-') {
            i++;
            sign = -1;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10)
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

           /* From my understanding, you are checking if you are going to overflow the int max before actually
            performing the operation.So you check if r is greater than Integer.MAX_VALUE minus d(since you
            'll add d if you perform the operation) divided by 10 (since you' ll multiple by 10 if you perform
            the operation).Now if this condition is true, you have to apply the -sign if negative which is what
            the second part of this statement represents.Hope this helps !*/

            res = res * 10 + digit;

            i++;
        }
        return res * sign;
    }
}

