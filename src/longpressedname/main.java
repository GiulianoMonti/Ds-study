package longpressedname;

public class main {
    public static void main(String[] args) {
        String name = "alexx";

        String typed = "aaleex";

        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        if (name.length() == typed.length()) {
            return true;
        }
        int n = 0;
        int t = 0;
        while (t < typed.length()) {
            if (n < name.length() && name.charAt(n) == typed.charAt(t)) {
                n++;
            } else {
                t++;
            }

        }
            if(typed.length()-1 == t){
                return false;
            }
        return name.length()-1 == n;
    }
}
