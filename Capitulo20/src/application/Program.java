package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;
import util.PriceUpdate;
import util.ProductPredicate;


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

    
    public static void axampleConsumer(){
  
        
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


}
