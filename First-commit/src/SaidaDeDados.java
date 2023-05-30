
public class SaidaDeDados {

    public static void impressao(){

        String nome= "Maria";
        int idade = 32;
        double renda = 10.35784;
        System.out.println(idade);
        System.out.printf("%.2f%n",renda);
        System.out.printf("%.4f%n",renda);
        System.out.printf("RESULTADO = %.2f metros%n",renda);
        System.out.printf("%s tem %d anos e ganha R$ %.2f0,00 reais%n",nome,idade, renda);

        
    }
    
}
