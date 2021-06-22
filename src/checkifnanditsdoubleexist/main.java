package checkifnanditsdoubleexist;

import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (Integer n : arr) {
            if (set.contains(n*2)) {
                return true;

            } else if(n%2==0) {

            }

                set.add(n);
            }
        return false;
        }

    }


