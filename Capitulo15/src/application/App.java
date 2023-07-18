package application;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        method2();

        
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
}
