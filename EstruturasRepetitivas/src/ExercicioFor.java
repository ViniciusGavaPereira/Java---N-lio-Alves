import java.util.Locale;
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

    public static void Exercicio3(){
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos números vão entrar: ");
        int N = sc.nextInt();

        for(int x = 0 ; x < N ; x++){

            System.out.print("Inserir valor com peso dois: ");
            float y = sc.nextFloat();

            System.out.print("Inserir valor com peso três: ");
            float w = sc.nextFloat();

            System.out.print("Inserir valor com peso cinco: ");
            float z = sc.nextFloat();

            float resposta = (2 * y + 3 * w + 5 * z)/10;

            System.out.printf("Resultado: %.1f\n", resposta);

        }

            sc.close();
    }


}
