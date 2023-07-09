package entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    
    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    public String priceTag(){
        return   super.getName() + " $" + String.format("%.2f",this.totalPrice())  + " (Customs fee: $" +  String.format("%.2f",customsFee)  + ");";
    }
    
}
