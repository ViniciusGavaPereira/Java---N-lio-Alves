import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Vetor {
    
    public static void vetor1(){
        
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

    public static void vetor2(){
        System.out.println("Terão quantos produtos? ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for(int i = 0 ; i < vect.length ; i++){
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();

            System.out.print("Digite o preço do produto: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);
           
        }

        double sum = 0.0;

        for(int i = 0 ; i < vect.length ; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("Média: %.2f",avg);

        sc.close();
    }


    public static void lista(){
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");

        System.out.println(list.size());


        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------");

        list.removeIf(x -> x.charAt(0) != 'M');

        for(String x : list){
            System.out.println(x);
        }

        System.out.println("----------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

    }
}
