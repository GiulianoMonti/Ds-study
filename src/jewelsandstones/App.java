package jewelsandstones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        HashSet<Character> j = new HashSet<Character>();
        for (char jewel: jewels.toCharArray()){
        j.add(jewel);
        }
        
        for (char stone: stones.toCharArray()){
            if(j.contains(stone)){
                c++;
            }
        }
        return c;
    }
}
