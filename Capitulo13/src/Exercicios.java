import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Order;
import entities.Worker;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;

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

    public static void exercicio1() throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");


        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),baseSalary,new Departament(departamentName));


        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n ; i++){
            
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            
            System.out.print("Value per hour: ");
            double valuPerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();

            HourContract contract = new HourContract(contractDate,valuPerHour,hour);
            worker.addContract(contract);

        }


        System.out.print("Enter the month and the year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name = " + worker.getName());
        System.out.println("Departament = " + worker.getDepartament());
        System.out.println("Income for = " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

       
        sc.close();

    }
}
