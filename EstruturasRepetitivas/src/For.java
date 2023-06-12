import java.util.Scanner;

public class For {

    public static void para(){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;

        for(int i = 0 ; i<N ; i++ ){

            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);
        sc.close();
    }
}
