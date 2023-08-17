import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicios {
    public static void exercicio1(){
            
        File file = new File("C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo 17\\txt\\in.txt");
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

    public static void exercicio2(){
        File file = new File("C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo 17\\txt\\in.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader(file);
            br = new BufferedReader(fr);

        }catch(IOException io){
            System.out.println("Error: " + io.getMessage());
        }finally{
            
            try{
                if(br != null){
                    br.close();
                }if(fr != null){
                    fr.close();
                }
            }catch(IOException io){
                io.printStackTrace();
            }

        }

    }

    //Melhor jeito de ler arquivos
    public static void exercicio3(){
        File file = new File("C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo 17\\txt\\in.txt");

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();

            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }catch(IOException io){
            System.out.println("Error: " + io.getMessage());
        }

    }

     public static void exercicio4(){
        String[] lines = new String[]{"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo17\\txt\\out.txt";


        //Cria um arquivo novo, caso este arquivo já exista, se tiver o parametro "true", ele faz um append
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){

            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }


        }catch(IOException io){
            System.out.println("Error: " + io.getMessage());
        }
    }   


    public static void exercicio5(){
        
        Scanner sc = new Scanner(System.in);

        //Exemplo possivel: C:\Users\vini-\Desktop\Projetos\Java-Nelio-Alves\Capitulo17
        System.out.println("Enter a folder path: ");

        String strPath = sc.nextLine();

        File path = new File(strPath);


        //Formula para buscar PASTAS de um caminho especifico 
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS");
        for(File folder : folders){
            System.out.println(folder);
        }
        System.out.println();

        //Formula para buscar ARQUIVOS de um caminho especifico 

        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS");
        for(File file: files){
            System.out.println(file);
        }

        //Cria uma subpasta com o nome EXEMPLO
        boolean success = new File(strPath + "\\EXEMPLO").mkdir();
        System.out.println("Diretório criado com sucesso: " + success);
        sc.close();
    }  
   
    public static void exercicioPratico(){
        
       String path = "C:\\Users\\vini-\\Desktop\\Projetos\\Java-Nelio-Alves\\Capitulo17\\csv\\summary.csv";


       try(BufferedReader bw = new BufferedReader(new FileReader(path))){
            String line = bw.readLine();

            while(line != null){
                System.out.println(line);
                line = bw.readLine();
                String[] fields = line.split("\s");

                String names = fields[0];

             //   for(String field : fields){
               //     System.out.println("Produto: " + fields[0]);

                //}

            }

       }catch(IOException io){
            System.out.println("Error: " + io.getMessage());
       }



    }       
}
