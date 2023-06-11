import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantos minutos o usuário falou?");
        int minutos = sc.nextInt();

        double conta = 50.0;

        if(minutos > 100){
            conta += (minutos - 100) * 2;
            System.out.printf("Valor a pagar: R$%.2f", conta );
        }else{
            System.out.printf("Valor a pagar: R$%.2f", conta);
        }
        
        sc.close();

    }
}
