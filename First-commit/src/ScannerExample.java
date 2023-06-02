import java.util.Scanner;

public class ScannerExample {

    public static void scannerExample(){

        

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        System.out.print("Digite seu nome:");
        x = sc.next();

        System.out.print("Digite a sua idade:");
        y = sc.nextInt();

        System.out.print("Digite a o seu salário:");
        z = sc.nextDouble();

       // System.out.print("O valor que você digitou é: " + x );
       // System.out.print("O valor que você digitou é: " + y );
        System.out.printf("O nome da pessoa é %s, a idade dela é %d e o seu salário é %2f ",x,y, z);

        sc.close();

    }

    
}
