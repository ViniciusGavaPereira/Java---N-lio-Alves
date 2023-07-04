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

    }
}
