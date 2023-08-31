package services;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Product;
import entities.Rectangle;
import entities.Shape;

public class Exercices {
    
    public static void generics(){
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();

        System.out.println("First: " + ps.first());
        sc.close();

    }

    public static void gerericoDelimitado(){

        List<Product> list = new ArrayList<>();

        String path = "C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo18\\txt\\produtos.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();


            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x); 
        }catch(IOException io ){
            System.out.println("Error: " + io.getMessage());

        }
    }

    public void tiposCuringa(){

        // O '?' é um coringa, que permite fazer o uppcasting de tipos comuns para tipos genéricos
        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

    }


    public static void tiposCuringaExemplo(){

        // O '?' é um coringa, que permite fazer o uppcasting de tipos comuns para tipos genéricos
        List<String> myInts = Arrays.asList("Maria", "Alex", "Bob");
        printList(myInts);

    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public static void genericosDelimitados(){
        	
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
