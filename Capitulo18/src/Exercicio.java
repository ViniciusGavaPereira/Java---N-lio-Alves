import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.CarRental;
import entities.Employee;
import entities.Vehicle;
import services.BrazilInterestService;
import services.BrazilTaxService;
import services.InterestService;
import services.RentalService;
import services.USAInterestService;

public class Exercicio {

    public static void exercicio1(){
        Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy HH:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy HH:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(cr);

		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();
    }
    
    public static void interfaceComparable(){
        
        List<Employee> list = new ArrayList<>();

        String path = "C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo18\\txt\\nomes.txt";
        

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String employeeCSV = br.readLine();

            while(employeeCSV != null){
                String[] fields = employeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1]) ));
                employeeCSV = br.readLine();
            }
            
            Collections.sort(list);
            
            for(Employee s : list){
                System.out.println(s);
            }
        }catch(IOException io){
            System.out.println("Error: " + io.getMessage());
        }
    }

    public static void defaultMethod(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();
        
        InterestService is = new USAInterestService(1.0);

        double payment = is.payment(amount, months);

        System.out.print("Payment after: " + months + ", months: ");
        System.out.println(String.format("%.2f",payment));

        sc.close();

    
    
    }
}
