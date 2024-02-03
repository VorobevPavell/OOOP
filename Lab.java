import java.util.Scanner;


public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double x = scanner.nextDouble();

        double degree = 2 * x + b;
        double y = Math.sqrt(Math.pow(Math.E, degree)) - 1.7 * Math.cos(x * c) / Math.log10(a + Math.pow(x, 2));

        System.out.println("Ответ: " + y);
    }
}
