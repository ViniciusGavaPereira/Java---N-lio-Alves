import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\vini-\\txt\\teste.txt");
        Scanner sc = null;
        try{
             
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        }catch(IOException io ){
            System.out.println("Error: " + io.getMessage());
        }finally{
            if(sc !=  null){
             sc.close();
            }
        }


        
    }
}
