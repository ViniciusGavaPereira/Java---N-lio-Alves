package entities;
import java.util.Random;

public class Account {
    
    private int numberAccount;
    private String name;
    private double balance;
    

    public Account() {
        Random random = new Random();
        this.numberAccount = random.nextInt(0, 100);
    }

    public Account(String name) {
        Random random = new Random();
        this.numberAccount = random.nextInt(0, 100);
        this.name = name;
        balance = 0;
    }

    public Account(String name, double balance) {
        Random random = new Random();
        this.numberAccount = random.nextInt(0,100);
        this.name = name;
        this.balance = balance;
    }
    
    public double getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= (withdraw + 5.00);
    }

    @Override
    public String toString() {
        return "Account\nNumberAccount = " + numberAccount + ",\nName = " + name + ",\nBalance = " + balance + "\n";
    }

    
}
