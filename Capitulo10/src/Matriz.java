import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Matriz {
    public static void matriz(){
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Digite o tamanho da matriz");

        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j] < 0){
                    count++;
                }
            
            }
        }

        System.out.println("Main diagonal: ");
        for(int i = 0; i<n; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();
        System.out.println("Total de números negativos: " + count);       

    }
}
