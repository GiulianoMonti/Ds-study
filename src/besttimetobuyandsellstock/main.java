package besttimetobuyandsellstock;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        System.out.println(maxProfit(prices));

        Scanner sc = new Scanner(System.in);
        String input ="";

        String line = sc.nextLine();

        while(!"end".equals(input)){
            input+= line+"/";
            line = sc.nextLine();

        }
        String[] stringLines = input.split("/");
        int nbRows = stringLines.length;

        System.out.println(line);
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];

            }

            if (prices[i] - buy > sell) {
                sell = prices[i] - buy;

            }
        }


        return sell;
    }
}


