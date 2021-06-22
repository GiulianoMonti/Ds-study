package numberofstepstoreducenumbertozero;

public class App {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

        public static int numberOfSteps(int num) {
            int count = 1;

            if (num < 1) {
                return 0;
            } else if (num % 2 == 0) {

               return numberOfSteps(num/2)+count;
            }
                count = 1;




            return  count +numberOfSteps(num-1);
    }
}
