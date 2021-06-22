package truncatesentence;

public class app {
    public static void main(String[] args) {
        String s = "Hello how are you today";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        int spaceCount = 0;
        String o="";
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }

            if(spaceCount==k){
                break;
            }
            o+=c;
        }
        return o;
    }
}

