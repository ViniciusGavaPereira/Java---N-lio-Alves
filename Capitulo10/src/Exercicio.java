import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.Product;

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


    public static void soma_vetor(){
        System.out.println("Quantos numeros voce vai digitar?");

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

        System.out.printf("Soma: %.2f\n",sum);
        System.out.printf("Média: %.2f",avg);

        sc.close();
    }

    public static void altura(){
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas vão ser acrescentadas?");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] vect = new Person[n];

        for(int i = 0 ; i < vect.length ; i++){
            sc.nextLine();
            System.out.print("Digite o nome da pessoa: ");
            String name = sc.nextLine();

            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();

            vect[i] = new Person(name, idade, altura);
           
            System.out.println(vect[i].toString());
        }


        sc.close();

    }

}
