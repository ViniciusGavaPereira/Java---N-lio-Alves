import java.util.Scanner;

public class ExercicioFor {
    
    public static void Exercicio1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = sc.nextInt();

        for(int i = 0; i < x ; i++){
            if(i%2 == 1){

                System.out.printf("Número ímpar: %d\n", i);
            }
        }

        System.out.printf("Valor final: %d",x);

        sc.close();
    }
}
