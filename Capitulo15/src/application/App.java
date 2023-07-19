package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Account;
import entities.Reservation;
import exception.DomainException;

public class App {
    public static void main(String[] args) throws Exception {
       
        exercicioFixacao();
        
    }

    public static void method2(){
        Scanner sc = new Scanner(System.in);


        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();

        }catch(InputMismatchException e){
            System.out.println("Inpu error");
            method2();
        }finally{
            System.out.println("End of program");
            sc.close();
        }
    }

    public static void metodoMuitoRuim() throws ParseException, DomainException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
        System.out.println("Room number");
        //int number = sc.nextInt();
        int number = 8021;

        System.out.println("Check-in date (dd/MM/yyyy): ");
        //Date checkIn = sdf.parse(sc.next());
        Date checkIn = sdf.parse("12/07/2023");
        
        System.out.println("Check-out date (dd/MM/yyyy): ");
        //Date checkOut = sdf.parse(sc.next());
        Date checkOut = sdf.parse("15/07/2023");

        if(!checkOut.after(checkIn)){
            System.out.println("Erro na reserva: a data de saida precisa ser depois da data de entrada.");
        }else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);


             System.out.println("Check-in date (dd/MM/yyyy): ");
            //Date checkIn = sdf.parse(sc.next());
            checkIn = sdf.parse("19/07/2023");
            
            System.out.println("Check-out date (dd/MM/yyyy): ");
            //Date checkOut = sdf.parse(sc.next());
            checkOut = sdf.parse("23/07/2023");

            Date now = new Date();

            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Erro na reserva: a data de entrada da atualização precisa ser uma data futura.");
            }else if(!checkOut.after(checkIn)){
                    System.out.println("Erro na reserva: a data de saida da atualização precisa ser uma data futura.");
            }else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("Reservation: " + reservation);
            }


        }

        sc.close();
    }

    public static void metodoRuim() throws ParseException, DomainException{
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
        System.out.println("Room number");
        //int number = sc.nextInt();
        int number = 8021;

        System.out.println("Check-in date (dd/MM/yyyy): ");
        //Date checkIn = sdf.parse(sc.next());
        Date checkIn = sdf.parse("12/07/2023");
        
        System.out.println("Check-out date (dd/MM/yyyy): ");
        //Date checkOut = sdf.parse(sc.next());
        Date checkOut = sdf.parse("15/07/2023");

        if(!checkOut.after(checkIn)){
            System.out.println("Erro na reserva: a data de saida precisa ser depois da data de entrada.");
        }else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);





            System.out.println("Enter a date to update Check-in (dd/MM/yyyy): ");
            //Date checkIn = sdf.parse(sc.next());
            checkIn = sdf.parse("19/07/2023");
            
            System.out.println("Enter a date to update Check-out  (dd/MM/yyyy): ");
            //Date checkOut = sdf.parse(sc.next());
            checkOut = sdf.parse("10/07/2023");


            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

        }

        sc.close();
    }

     public static void metodoBom(){
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    

        try{
            System.out.println("Room number");
            //int number = sc.nextInt();
            int number = 8021;

            System.out.println("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            //Date checkIn = sdf.parse("12/07/2023");
            
            System.out.println("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());
            //Date checkOut = sdf.parse("15/07/2023");

            
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter a date to update Check-in (dd/MM/yyyy): ");
            //Date checkIn = sdf.parse(sc.next());
            checkIn = sdf.parse("19/07/2023");
                
            System.out.println("Enter a date to update Check-out  (dd/MM/yyyy): ");
            //Date checkOut = sdf.parse(sc.next());
            checkOut = sdf.parse("10/07/2023");


            reservation.updateDatesBom(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }catch(ParseException e){
            System.out.println("Invalid date format");
        }catch(DomainException e ){
            System.out.println("Error in reservation: " + e.getMessage());
        }catch(RuntimeException e){
            System.out.println("Unexpected error");
        }


             sc.close();
        }

        public static void exercicioFixacao(){
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER ACCOUNT DATA");

            System.out.print("Number: 8021\n");
            int number = 8021;

            System.out.print("Holder: Bob Brown\n");
            String holder = "Bob Brown";
            
            System.out.print("Initial balance: 1000\n");
            double initialBalance = 1000;

            System.out.print("Witdraw limit: 2000\n");
            double witdrawLimit = 2000;

            try{
                Account account = new Account(number,holder,initialBalance,witdrawLimit);
            
                System.out.print("Entre o quanto deseja sacar: ");
                double witdrawAmount = sc.nextDouble(); 

                account.witdraw(witdrawAmount);

            }catch(DomainException e){
                System.out.println(e.getMessage());
            }finally{
                sc.close();
            }            
        }

   
     }


