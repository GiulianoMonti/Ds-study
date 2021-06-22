package reversestring;

public class main {
    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        reverseString(a);
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;


        for (int i = 0; i < end; i++) {
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start++;
            end--;
        }
        System.out.println(s);
    }

}

