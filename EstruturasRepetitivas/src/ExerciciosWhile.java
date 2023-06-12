import java.util.Scanner;

public class ExerciciosWhile {

    static void exercicio1(){

        Scanner sc = new Scanner(System.in);
        int tentativa;
        final int senha = 2002;

        System.out.print("Digite a sua senha: ");
        tentativa = sc.nextInt();
        while(tentativa != senha){
            System.out.print("Senha errada\nTente novamente:");
            tentativa = sc.nextInt();
        }

        System.out.print("Acesso permitido");
        sc.close();
    }

    static void exercicio2(){
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.print("Digite o valor de X: ");
        x = sc.nextInt();

        System.out.print("Digite o valor de Y: ");
        y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("O ponto é do primeiro quadrante");
            }else if(x > 0 && y < 0){
                System.out.println("O ponto é do quarto quadrante");
            }else if(x < 0 && y < 0){
                System.out.println("O ponto é do terceiro quadrante");
            }else if(x < 0 && y > 0){
                System.out.println("O ponto é do segundo quadrante");
            }
            	x = sc.nextInt();
			    y = sc.nextInt();

        }

        sc.close();


    }

    static void exercicio3(){
        Scanner sc = new Scanner(System.in);
        int x;

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Produtos:\n" +
        "1 - Álcool\n" + 
        "2 - Gasolina\n" +
        "3 - Diesel\n" +
        "4 - Fim");

        x = sc.nextInt();

        while(x !=  4 ){

            switch(x){
                case 1:
                System.out.println("Compra de álcool.\n");
                alcool++;
                break;
                
                case 2:
                System.out.println("Compra de gasolina.\n");
                gasolina++;
                break;

                case 3:
                System.out.println("Compra de diesel.\n");
                diesel++;
                break;

               
                
            }

            System.out.println("Compra acrescentada ao carrinho\n");

            System.out.println("Produtos:\n" +
                "1 - Álcool\n" + 
                "2 - Gasolina\n" +
                "3 - Diesel\n" +
                "4 - Fim");


            x = sc.nextInt();
        }

            System.out.println("MUITO OBRIGADO");
            
            System.out.printf("ÁLCOOL: %d\nGASOLINA: %d\nDIESEL: %d",alcool,gasolina,diesel);

            sc.close();
    }
}
