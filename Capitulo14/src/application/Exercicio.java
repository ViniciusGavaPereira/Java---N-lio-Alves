package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.Employee;
import entities.OutsourcedEmployee;
import entities.SavingAccount;

public class Exercicio {

    public static void Explicacao(){
         System.out.println("Hello, World!");


        //UPCASTING
        Account acc2 = new BusinessAccount(3, "Bob", 0.0,450.0);
        Account acc3 = new SavingAccount(4, "Ana", 0.0,450.0);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100);

        //BusinessAccount acc5 = (BusinessAccount)acc3; <--- Não pode fazer o empréstimo, pois acc5 é uma conta Saving, não Bussines
        if(acc3 instanceof BusinessAccount){ // <--- Para fazer funcionar precisa testar neste formato
            System.out.println();
            System.out.println("Loan!");

        
        }

          if(acc3 instanceof SavingAccount){ 
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        
        }
    }

    public static void exercicio1(){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();


        System.out.println("Digite a quantidade de funcionários");
        int n = sc.nextInt();


        for(int i = 1; i <= n ; i++){
            
            System.out.println("Dados do # " + i +  "° funcionário ");
            System.out.println("O funcionário é terceirizado? (S/N)");
            char ch = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hour: ");
            int hours = sc.nextInt();

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(ch == 's'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(emp);
                
            }else{
                Employee emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }

        }

        System.out.println("\nPAGAMENTOS");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
