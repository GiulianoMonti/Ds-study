package backspacestringcompare;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "ab#c";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        int s_pointer = s.length() - 1, t_pointer = t.length() - 1;
        int skipS = 0, skipT = 0;

        while( s_pointer >= 0 || t_pointer >= 0){

            while(s_pointer>=0){
                if(s.charAt(s_pointer)=='#'){
                    skipS+=1;
                    s_pointer-=1;

                }else if(skipS>0){
                    s_pointer-=1;
                    skipS-=1;

                }else{
                    break;
                }
            }
            while(t_pointer>=0){
                if(t.charAt(t_pointer)=='#'){
                    skipT+=1;
                    t_pointer-=1;

                }else if(skipT>0){
                    t_pointer-=1;
                    skipT-=1;

                }else{
                    break;
                }
            }
            if(s_pointer>=0&&t_pointer>=0&&s.charAt(s_pointer)!=t.charAt(t_pointer)){
                return false;
            }


            if((s_pointer>=0)!=(t_pointer>=0)){
                return false;
            }
            s_pointer-=1;
            t_pointer-=1;
        }
        return true;
    }
}





//    Given two strings s and t, return true if they are equal when both are typed into empty text editors.
//    '#' means a backspace character.
//
//        Note that after backspacing an empty text, the text will continue empty.
//
//
//
//        Example 1:
//
//        Input: s = "ab#c", t = "ad#c"
//        Output: true
//        Explanation: Both s and t become "ac".

