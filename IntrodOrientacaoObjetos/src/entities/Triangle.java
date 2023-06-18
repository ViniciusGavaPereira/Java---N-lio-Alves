package entities;

import java.util.Scanner;

public class Triangle {
    
    public double a;
    public double b;
    public double c;
    
    public Triangle() {
       
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

   public double calcularArea(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Defina as medidas do triãngulo X: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double p = (a + b + c) / 2.0;
        double areaX = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.printf("Triangulo de X: %.4f", areaX);
        sc.close();
         
        return areaX;
   }

    @Override
    public String toString() {
        return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
    }

   
}
