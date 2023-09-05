package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;


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

    


}
