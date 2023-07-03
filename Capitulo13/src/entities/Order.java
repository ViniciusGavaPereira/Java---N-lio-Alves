package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
    private Date moment = new Date();
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();


    
    public Order() {
        this.moment = new Date();
        this.status = OrderStatus.PENDING_PAYMENT;

    }




    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        
        double sum = 0;

        for(OrderItem x  : items){

            sum += x.subTotal();
        }
        
        return sum;
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY\n");
        sb.append("Order moment: " + moment + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " - " + client.getBirthDate() + " - " + client.getEmail() + "\n");

        sb.append("Order items: \n");
        for(OrderItem c : items){
            sb.append(c.getProduct().getName() + " " + c.getProduct().getPrice() +", Quantity: " + c.getQuantity() + " Subtotal: $" + c.subTotal() + "\n");
        }

        sb.append("Total price: " + total());
        return sb.toString();
    }

    
}
