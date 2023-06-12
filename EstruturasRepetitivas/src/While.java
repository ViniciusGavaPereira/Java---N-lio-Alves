import java.util.Scanner;

public class While {
    
    static void enquanto(){
        //While executa um comando ENQUANTO for verdadeiro

        Scanner  sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        int soma = 0;

        while(x != 0){
            soma += x;

            System.out.print("Digite um número: ");
            x = sc.nextInt();
        }

        System.out.printf("Não pode digitar zero! \nValor da soma: %d", soma);

        sc.close();
    }
}
