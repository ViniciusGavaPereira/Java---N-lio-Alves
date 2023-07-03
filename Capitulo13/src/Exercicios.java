import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Comment;
import entities.Departament;
import entities.HourContract;
import entities.Order;
import entities.OrderItem;
import entities.Post;
import entities.Product;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Exercicios {

    public static void introducao(){
        System.out.println("Hello, World!");

       /*  Order order = new Order(1, new Date(), OrderStatus.SHIPPED);

        System.out.println(order.toString());

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2); */
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


    public static void exercicio2() throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(
        sdf.parse("21/06/2018 13:05:44"),
        "Travelling to New Zeland",
        "Im going to visit this wonderfull country",
        12);

        post1.AddCOmment(c1);
        post1.AddCOmment(c2);

        System.out.println(post1.toString());


    }

    public static void exercicio3() throws ParseException{

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt1 =  new SimpleDateFormat("dd/MM/yyyy");
        Order ord1 = new Order();



        Client clt1 = new Client();
        System.out.println("Enter client data");
        System.out.print("Name: Vinicius\n");
        //clt1.setName(sc.next());
        clt1.setName("Vinicius");

        System.out.print ("Email: vini-gava@outlook.com\n");
        //clt1.setEmail(sc.next());
        clt1.setEmail("vini-gava@outlook.com");
      
        
        System.out.print("Birth date (DD/MM/YYYY): 18/01/2000\n");
        //clt1.setBirthDate(fmt1.parse(sc.next()));
        clt1.setBirthDate(fmt1.parse("18/01/2000"));
       
        ord1.setClient(clt1);

        System.out.println("Status: " + ord1.getStatus());


        System.out.println("How many items to this order?" );
        int quantity = sc.nextInt();

        for(int x = 1; x <= quantity; x++){

            Product product = new Product();
            System.out.println("Enter product #" + x + " item data:");
            System.out.print("Product name: ");
            product.setName(sc.next());

            System.out.print("Product price: ");
            product.setPrice(sc.nextInt());

            System.out.print("Product quantity: ");
            Integer quant = sc.nextInt();

            OrderItem orderItem = new OrderItem(quant, product);

            ord1.addItem(orderItem);

            
        }

        System.out.println(ord1.toString());
        
        sc.close();

    }
}
