package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Account acc = new Account(1, "Alex", 0.0);
        BusinessAccount bacc= new BusinessAccount(2, "Maria", 0.0, 500.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(3, "Bob", 0.0,450.0);
        Account acc3 = new SavingAccount(4, "Ana", 0.0,450.0);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100);

        //BusinessAccount acc5 = (BusinessAccount)acc3; <--- Não pode fazer o empréstimo, pois acc5 é uma conta Saving, não Bussines
        if(acc3 instanceof BusinessAccount){ // <--- Para fazer funcionar precisa testar neste formato
            BusinessAccount acc5 = (BusinessAccount)acc3;
            System.out.println();
            System.out.println("Loan!");

        
        }

          if(acc3 instanceof SavingAccount){ 
            SavingAccount acc5 = (SavingAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        
        }


    }
}
