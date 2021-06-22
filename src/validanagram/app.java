package validanagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class app {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {


        Map<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c:t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0)
                return false;
        }
        return true;
    }
}