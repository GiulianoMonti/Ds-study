package validparenthesis;

import java.util.Stack;

public class mail {
    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));

            } else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                if (checkIfSame(stack.peek(),s.charAt(i))){
                    return false;
                }else{
                    stack.pop();
                }

            }


        }
        return stack.isEmpty();

    }

    public static boolean checkIfSame(char a, char b) {

        if (a == '(' && b == ')') {
            return false;
        } else if (a == '[' && b == ']') {
            return false;
        }
        return true;
    }
}

