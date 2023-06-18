package application;

import java.util.Scanner;

import entities.Triangle;

public class Example {
    
    public static void example1(){
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Defina as medidas do triãngulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Defina as medidas do triãngulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangulo de X: %.4f \nTriangulo de Y: %.4f", areaX, areaY);
        sc.close();

        if(areaX > areaY){
            System.out.println("A maior área é do X");
        }else{
              System.out.println("A maior área é do Y");
        }
    }

    public static void example2(){
        Scanner sc = new Scanner(System.in);
        
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Defina as medidas do triãngulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Defina as medidas do triãngulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangulo de X: %.4f \nTriangulo de Y: %.4f", areaX, areaY);
        sc.close();
 
    }

    public static void example3(){
         Triangle x = new Triangle();
         x.calcularArea();
         
    }

}
