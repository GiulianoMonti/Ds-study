package tolowercase;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        String ss = "al&phaBET";
        System.out.println(toLowerCase(ss));
    }

    public static String toLowerCase(String str) {
        String output = "";
        char[] charsArr = str.toCharArray();
        for (int i = 0; i < charsArr.length; i++) {
            if (charsArr[i] >= 'A' && charsArr[i] < 'a') {
                charsArr[i] +=32;

            }
        }

        return String.valueOf(charsArr);
    }
}


//    public static String toLowerCase(String str) {
//        String output = "";
//        char[] charsArr = str.toCharArray();
//        for (int i = 0; i < charsArr.length; i++) {
//            if (charsArr[i] >= 'A' && charsArr[i] < 'a') {
//                output += Character.toString(charsArr[i] + 32);
//
//            }else{
//                output+=Character.toString(charsArr[i]);
//            }
//        }
//
//        return output;
//    }
//}
//
