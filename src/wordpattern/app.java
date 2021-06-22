package wordpattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class app {
    public static void main(String[] args) {
        String p = "abca";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(p, s));
    }



    public static boolean wordPattern(String p, String s) {

        HashMap<Character, String> map = new HashMap<>();
        String[] temp = s.split("\\s");
        char[] c = p.toCharArray();
        for(int i = 0 ; i<temp.length ; i++){
            if (map.containsKey(c[i]) && !map.get(c[i]).equals(temp[i])) return false;
            if (!map.containsKey(c[i]) && map.containsValue(temp[i])) return false;
            map.put(c[i], temp[i]);

        }
        return true;
    }
}
