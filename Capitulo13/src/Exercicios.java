import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Exercicios {
    public static void introducao(){
        System.out.println("Hello, World!");

        Order order = new Order(1, new Date(), OrderStatus.SHIPPED);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }

    public static void exercicio1(){
        
    }
}
