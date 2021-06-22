package firstuniquecharacterinastring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class app {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int res = Integer.MAX_VALUE;
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, -10);
            } else {
                map.put(c, i++);

            }

        }
        System.out.println(map);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if(m.getValue()>=0)
            res = Math.min(m.getValue(), res);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
