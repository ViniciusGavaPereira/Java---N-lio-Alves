import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {



        System.out.println("Quantas casas terá o array? ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0 ; i < n ; i++){
            System.out.printf("Insira um número: ",i);    
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0 ; i < n ; i++){
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("Média: %.2f",avg);

        sc.close();
    }
}

