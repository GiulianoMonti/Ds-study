package nextgreaterelement1;

import java.util.*;

public class main {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,4};
        int[] b = {6,5,4,3,2,1,7};
        System.out.println(Arrays.toString(nextGreaterElement(a, b)));
    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] a = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {

           while (!stack.isEmpty()&&stack.peek() < nums2[i]) {
               map.put(stack.pop(), nums2[i]);

           }
                stack.push(nums2[i]);

        }
       for ( int i = 0 ; i <nums1.length;i++){
           a[i]= map.getOrDefault(nums1[i],-1);

       }

        return a;
    }
}

