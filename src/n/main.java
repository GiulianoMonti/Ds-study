package n;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class main {
    public static void main(String[] args) {

        String s = "(()())(())";

        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String S) {
        // if the stack is empty its outside parentheses
        Stack<Character> stack = new Stack<>();
        Set<Integer> set = new HashSet<>();
        String x = "";

        for (char p : S.toCharArray()) {

           if(stack.isEmpty()&&p=='('){    // if the stack is empty we have an OUTSIDE PARENTHESES not append to output
               stack.push(p);
           }else if( p=='(') {     // we append the output because its an inside parentheses
               x += p;
               stack.push(p);
           }  else if(p == ')'&& stack.size() >1){  // append the closing parentheses if the stack is not empty
                   stack.pop();  // pop from the stack
                   x += p;
                   //}
               }
               else if (p == ')')
                   stack.pop();
        }
        return x;
    }
}

