import java.util.Scanner;

public class EstruturaSequencial_Exercicios {
   
    public static void Exercicio1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro número:");

        double valor1 = sc.nextDouble();

        System.out.println("Insira o segundo número:");

        double valor2 = sc.nextDouble();

        System.out.print("Soma = " + valor1 +  " + " + valor2 + " = ");
        valor2 = valor2 + valor1;
        System.out.print(valor2);

        sc.close();
    }
   
    public static void Exercicio2(){
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;

        System.out.print("Digite o valor do raio de um círculo: ");

        double valor1 = sc.nextDouble();

        double raio = pi * Math.pow(valor1,2);
        
        System.out.printf("O valor do raio do circulo é %.4f", raio);

        sc.close();
    
    }

    public static void Exercicio3(){
        Scanner sc = new Scanner(System.in);

        float a, b, c, d;
    
        System.out.print("Digite o valor de a: ");
        a = sc.nextFloat();

        System.out.print("Digite o valor de b: ");
        b = sc.nextFloat();

        System.out.print("Digite o valor de c: ");
        c = sc.nextFloat();

        System.out.print("Digite o valor de d: ");
        d = sc.nextFloat();

        float diferenca = (a * b - c * d);

        System.out.printf("A diferença é %.2f", diferenca);

        sc.close();


    }

    public static void Exercicio5(){

        Scanner sc = new Scanner(System.in);
        int qtd1,qtd2;
        double preco1,preco2,total;  

        System.out.print("Digite a quantidade do produto 1 : ");
	    qtd1 = sc.nextInt();
        System.out.print("Digite o preço do produto 1 : ");
	    preco1 = sc.nextDouble();

        System.out.print("Digite a quantidade do produto 2 : ");
	    qtd2 = sc.nextInt();
        System.out.print("Digite o preço do produto 2 : ");
	    preco2 = sc.nextDouble();
         
        total = preco1 * qtd1 + preco2 * qtd2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }

    public static void Exercicio6(){
        Scanner sc = new Scanner(System.in);

        float a,b,c;
        double pi = 3.14159, triangulo, circulo,trapezio,quadrado,retangulo;

        System.out.print("Digite o valor de A: ");
        a = sc.nextFloat();

        System.out.print("Digite o valor de B: ");
        b = sc.nextFloat();

        System.out.print("Digite o valor de C: ");
        c = sc.nextFloat();

        triangulo = (a * c) / 2;
        System.out.printf("Área do triangulo: %.3f%n", triangulo);

       
        circulo = pi * Math.pow(c,2);;
        System.out.printf("Área do circulo: %.3f%n", circulo); 

        trapezio = ((a + b) * c) / 2;
        System.out.printf("Área do trapézio: %.3f%n", trapezio); 

        quadrado = b * b;
        System.out.printf("Área do quadrado: %.3f%n", quadrado); 

        retangulo = a * b;
        System.out.printf("Área do retangulo: %.3f%n", retangulo); 

        sc.close();
    }

}
