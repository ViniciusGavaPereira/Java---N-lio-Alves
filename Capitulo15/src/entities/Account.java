package entities;


import exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double witdrawLimit;

    public Account() {
    }


    
    public Account(Integer number, String holder, Double balance, Double witdrawLimit) throws DomainException{
        if(balance < 0){
            throw new DomainException("Conta não pode ser iniciada com o valor menor que 0");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.witdrawLimit = witdrawLimit;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
   

    public Double getWitdrawLimit() {
        return witdrawLimit;
    }
   

    public void deposit(double amount){
        this.balance += amount;
    }

    public void witdraw(double amount) throws DomainException{
        
        if(amount > witdrawLimit){
            throw new DomainException("Valor a sacar passa do limite permitido");
        }else if(amount > balance){
            throw new DomainException("Saldo insuficiente");
        }

        this.balance -= amount;
        System.out.println("\n" + toString());
    }



    @Override
    public String toString() {
        return "Account" +
        "\nNumber: " + number + 
        "\nHolder: " + holder + 
        "\nBalance: " + balance + 
        "\nWitdrawLimit: " + witdrawLimit;
      
    }

    

}
