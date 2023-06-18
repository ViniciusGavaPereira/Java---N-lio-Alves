import java.util.Scanner;

public class Exercicios {
    

    public static void Exercicio1(){

        Retangulo ret = new Retangulo(3.00, 4.00);

        System.out.println("Área: "  + ret.area());
        System.out.println("Perimetro: "  + ret.perimeter());
        System.out.println("Diagonal: "  + ret.diagonal());
    }

    public static void Exercicio2(){
        Scanner sc = new Scanner(System.in);

        Employee Claudio = new Employee();
        System.out.print("Digite o nome do funcionáro: ");
        Claudio.Name = sc.next();

    
        System.out.print("Digite o salário bruto do funcionario: ");
        Claudio.GrossSalary = sc.nextDouble();
        
        System.out.print("Digite os descontos do funcionário: ");
        Claudio.Tax = sc.nextDouble();

        System.out.println("Funiconário cadastrado!");
        System.out.println(Claudio.toString());
       

        System.out.println("Diga a porcentagem de aumento no salário: ");
        double acréscimo = sc.nextDouble();

        Claudio.IncreaseSalary(acréscimo);

        sc.close();
    }
}
