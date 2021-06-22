package besttimetobuyandsellstock2;

public class main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};      //
        int[] arr2 ={7, 1, 5, 3, 6, 4};
        int[] arr3 ={7,6,4,3,1};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr2));
        System.out.println(maxProfit(arr3));
    }

    public static int maxProfit(int[] prices) {
        int sell = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
               sell += prices[i]-prices[i-1];
            }
        }
        return sell;
    }


}



