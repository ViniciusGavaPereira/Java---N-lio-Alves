import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Entities.Contract;
import Entities.Installment;
import Service.ContractService;
import Service.PaypalService;

public class App {
    public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        //int number = 8030;
        
        System.out.print("Data (dd/MM/yyyy): ");
		LocalDate dataContrato = LocalDate.parse(sc.next(), fmt);
        //LocalDate dataContrato = LocalDate.parse("21/08/2023", fmt);

        System.out.print("Valor do contrato: ");
        Double valor = sc.nextDouble();
        //Double valor = 600.00;

        System.out.print("Entre com o número de parcelas:  ");
        int parcelas = sc.nextInt();
        //int parcelas = 3;

        Contract contract = new Contract(number,dataContrato,valor);


        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, parcelas);

        System.out.println("Parcelas: ");


        System.out.println(contract.getParcelas().toString());


        sc.close();
    }
}
