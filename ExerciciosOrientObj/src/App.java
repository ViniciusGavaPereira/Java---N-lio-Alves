import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circunferencia(radius);

        double v = Calculator.volume(radius);

        System.out.println("Circunferencia: " + c);
        System.out.println("Volume: " + v);
        System.out.println("Valor de PI: " + Calculator.PI);

        sc.close();
    }
}
