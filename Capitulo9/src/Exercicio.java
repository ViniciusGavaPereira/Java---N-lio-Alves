import java.util.Scanner;

import entities.Account;

public class Exercicio {

    public static void exercicio1(){
        Scanner sc = new Scanner(System.in);  
        int escolha = 0;

        System.out.print("Digite o nome do dono da conta: ");
        String nome = sc.nextLine();
        System.out.print("Digite o saldo de entrada: ");
        double saldoInicial = sc.nextDouble();
        
        Account conta = new Account(nome, saldoInicial);
       
        System.out.println("\n" + conta.toString());

      while(escolha != 3){
        System.out.println("====================================");
        System.out.println("OPÇÕES:");
        System.out.println("1---> DEPOSITAR");
        System.out.println("2---> SACAR");
        System.out.println("3---> SAIR");

        escolha = sc.nextInt();
        
        if(escolha == 1){

            System.out.print("Valor á ser depositado: ");
            conta.deposit(sc.nextDouble());
            System.out.println(conta.toString());

        }else if(escolha == 2){

            System.out.print("Valor á ser sacado: ");
            conta.withdraw(sc.nextDouble());
            System.out.println(conta.toString());
    
        }else{
            escolha = 3;
            System.out.println("SAIR");
        }
      
      }

      sc.close();
    }
}
