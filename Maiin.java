import java.util.Scanner;


public class Maiin {

    public static int getFactorial(double f) {
        int fact = 1;
        for (int i = 1; i <= f; i++) {
           fact = fact * i;
        }
        return fact;
      }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    

        System.out.println("Введите x: ");
        int x = input.nextInt();

        double result = 0;

        for(int n = 2; n < x; n++) {
            result += Math.pow(-1, n + 1) * (n - 1) * Math.pow(x, n) / getFactorial(n);
        }

        result++;
        System.out.println("Ответ: " + result);
    }
}


