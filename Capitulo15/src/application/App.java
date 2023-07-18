package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Reservation;

public class App {
    public static void main(String[] args) throws Exception {
       metodoMuitoRuim();
        
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

    public static void metodoMuitoRuim() throws ParseException{
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

}
