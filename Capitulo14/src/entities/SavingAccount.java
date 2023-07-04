package entities;

public final class SavingAccount extends Account{
    
    private Double interestRate;

    public SavingAccount(){

    }

    public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //Exemplo de sobreposição
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }

}
