package removealladjacentduplicates;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        String s = "azxxzy";

        System.out.println((removeDuplicates(s)));
    }

    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();

        String x="";
        for (int i = 0;i<S.length();i++) {


            if (stack.isEmpty()) {
                stack.push(S.charAt(i));
            }
            else if (S.charAt(i) == stack.peek()) {
                stack.pop();
            } else if (S.charAt(i) != stack.peek()) {
                stack.push(S.charAt(i));
            }
        }
        for (char ch: stack){
            x+=ch;
        }

        return x;
    }
}


