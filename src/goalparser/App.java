package goalparser;

import java.util.Stack;
import java.util.StringJoiner;

public class App {
    public static void main(String[] args) {
        String s = "(al)G(al)()()G";

        System.out.println(interpret(s));
    }

    public static String interpret(String command) {
        return command.replaceAll("\\(\\)", "o").replaceAll("\\(al\\)", "al");
    }
}
