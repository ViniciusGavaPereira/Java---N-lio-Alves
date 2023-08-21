package Entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double totalValue;
    private ArrayList<Installment> parcelas = new ArrayList<>();


    
    public Contract(Integer number, LocalDate date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }


    public Contract(int number2, LocalDate ldt, Double valor, int parcelas2) {
    }


    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }


    public Double getTotalValue() {
        return totalValue;
    }
    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }


    public ArrayList<Installment> getParcelas() {
        return parcelas;
    }


    public void setParcelas(ArrayList<Installment> parcelas) {
        this.parcelas = parcelas;
    }


    public LocalDate getDate() {
        return date;
    }


    public void setDate(LocalDate date) {
        this.date = date;
    }

    
   
}
