package restorestring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String s = "aiohn";
        int[] indices = {3, 1, 4, 2, 0};
        System.out.println(restoreString(s, indices));
    }


    public static String restoreString(String s, int[] indices) {
        char[]result = new char[indices.length];
        for(int i = 0; i<s.length();i++){
            result[indices[i]]=s.charAt(i);
        }
        return new String (result);
    }
}
