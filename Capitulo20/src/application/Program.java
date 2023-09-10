package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import entities.Product;
import services.ProductService;
import util.ProductPredicate;
import util.UpperCaseName;
import java.util.stream.Stream;

public class Program {

    public static void comparator(){

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1220.00));
        list.add(new Product("Tablet", 450.00));


        //ode fazer com o arquivo separado:
        //list.sort(new MyComparator());


        //OU

        //Fazer uma classe anônima + expressão lambda:
        Comparator<Product> comp = (p1,p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        list.sort(comp);

        for(Product p : list){
            System.out.println(p.getName());
        }
      
        
    }

    public static void axamplePredicate(){
  
        
    List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 2220.00));
        list.add(new Product("Tablet", 450.00));        
        list.add(new Product("Case de notebook", 90.00));        
        list.add(new Product("Pelicula", 45.00));        
        list.add(new Product("Mouse", 49.00));        


        list.removeIf(new ProductPredicate());

        for(Product p : list){
            System.out.println(p.getName());
        }
      

    }

    
    public static void exampleConsumer(){
  
        
    List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 2220.00));
        list.add(new Product("Tablet", 450.00));        
        list.add(new Product("Case de notebook", 90.00));        
        list.add(new Product("Pelicula", 45.00));        
        list.add(new Product("Mouse", 49.00));        



        //Usando expressões lambdas inline
        double factor = 1.1;
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        // Usando a interface consumer:
        //list.forEach(new PriceUpdate());

         for(Product p : list){
            System.out.println(p.getName() + " " + p.getPrice());
        }
   
    }


    public static void exampleFunction(){
  
        
    List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 2220.00));
        list.add(new Product("Tablet", 450.00));        
        list.add(new Product("Case de notebook", 90.00));        
        list.add(new Product("Pelicula", 45.00));        
        list.add(new Product("Mouse", 49.00));        


        //Usando expressões lambdas inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        // Usando a interface Function:
        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());



         for(String p : names){
            System.out.println(p);
        }
    }


    
    public static void exampleFunctionInsideFunction(){
  
        ProductService ps = new ProductService();
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 2220.00));
        list.add(new Product("Tablet", 450.00));        
        list.add(new Product("Case de notebook", 90.00));        
        list.add(new Product("Pelicula", 45.00));        
        list.add(new Product("Mouse", 49.00));        


       
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        System.out.println(sum);
        
    }


    public static void Stream(){
        List<Integer> list = Arrays.asList(3,4,5,10,7);
        
        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria","Alex","Bob");
        System.out.println(Arrays.toString(st2.toArray()));


        Stream<Integer> st3 = Stream.iterate(0, x-> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

    } 

    public static void StreamPipeline(){
        List<Integer> list = Arrays.asList(3,4,5,10,7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0,(x,y) -> x + y);
        System.out.println("Somatória: " + sum);

        List<Integer> newList = list.stream()
                                .filter(x -> x % 2 == 0)
                                .map(x -> x * 10)
                                .collect(Collectors.toList());

        System.out.println(Arrays.toString(newList.toArray()));
    } 

    public static void exercicioResolvido(){
        Scanner sc = new Scanner(System.in);
        
        String path = "C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo20\\src\\txt\\list.txt";


        try(BufferedReader bw = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();

            String line = bw.readLine();
          
            while(line != null || line == " "){
                System.out.println(line);
                
                String[] fields = line.split(",");


                list.add(new Product(fields[0], Double.parseDouble(fields[1]))); 
                line = bw.readLine();
            }
            
            double avg = list.stream()
            .map(p -> p.getPrice())
            .reduce(0.0, (x,y) -> x+y) / list.size();

            System.out.println("Average value from list: " + avg);

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
                                    .filter(p -> p.getPrice() > avg)
                                    .map(p -> p.getName())
                                    .sorted(comp.reversed()).toList();


            System.out.println(Arrays.toString(names.toArray()));

        }catch(IOException io ){
            System.out.println("Arquivo não existe");
        }

        



        sc.close();
    }
}
