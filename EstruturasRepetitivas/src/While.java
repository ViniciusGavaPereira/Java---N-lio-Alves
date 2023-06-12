import java.util.Scanner;

public class While {
    
    static void enquanto(){
        //While executa um comando ENQUANTO for verdadeiro

        Scanner  sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        while(x != 0){

            System.out.print("Digite um número: ");
            x = sc.nextInt();
        }

        System.out.print("Não pode digitar zero");

        sc.close();
    }
}
