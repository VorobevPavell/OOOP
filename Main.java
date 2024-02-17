import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите х");
        double x = input.nextDouble();
        System.out.println("Введите a");
        double a = input.nextDouble();
        System.out.println("Введите b");
        double b = input.nextDouble();
        double result;

        if(x <= -1) {
            result = a * Math.pow(x, 2);
        }
        else {
            result = b + Math.pow(x, 2) / Math.pow(x, 2) + a;
        }

        System.out.println("Ответ: " + result);
    }
}


