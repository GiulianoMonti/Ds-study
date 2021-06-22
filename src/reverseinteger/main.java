package reverseinteger;

public class main {
    public static void main(String[] args) {
        int a = 123;
        System.out.println(reverse(a));
    }

    public static int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            int newResult = (result * 10) + lastDigit;
            if(result!=(newResult-lastDigit)/10){
                return 0;
            }
            x/=10;
            result= newResult;
        }
        return result;
    }
}

