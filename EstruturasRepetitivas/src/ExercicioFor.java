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

    public static void Exercicio2(){
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números vão entrar: ");
        int N = sc.nextInt();
        int in = 0, out = 0;

    
        for(int x = 0 ; x < N ; x++){

            System.out.print("Valor para inserir: ");
            int y = sc.nextInt();

            if(y > 10 && y < 20 ){
                in++;
            }else{
                out++;
            }

        }

        System.out.printf("Valores:\nIN: %d\nOUT: %d", in,out);
        sc.close();
    
    }

}
