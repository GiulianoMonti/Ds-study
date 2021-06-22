package substracttheproduct;

public class App {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(91));
    }


    public static int subtractProductAndSum(int n) {
        return multiplicacion(n) - suma(n);
    }
    public static int multiplicacion(int n) {
        if(n<10){
            return n;
        }

        return multiplicacion(n % 10) * multiplicacion(n / 10);

    }
    public static int suma(int n) {
        if(n<10){
            return n;
        }

        return  multiplicacion(n % 10) + suma(n / 10);

    }
}
