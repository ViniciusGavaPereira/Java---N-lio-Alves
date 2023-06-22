import java.util.Scanner;

public class Exercicio {
    public static void negativo(){
        

        System.out.println("Quantas casas terá o array? ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        if(n > 10){
            System.out.println("Valor máximo é 10");
            n = 10;
        }
        
        int[] vect = new int[n];

        for(int i = 0 ; i < vect.length; i++){
            
            System.out.print("Insira o valor: ");
            int number = sc.nextInt();
            vect[i] = number;

        }

        System.out.println("Números negativos: ");
        for(int i = 0 ; i < vect.length; i++){
                 
            
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }

        }

        sc.close();
    }
}
