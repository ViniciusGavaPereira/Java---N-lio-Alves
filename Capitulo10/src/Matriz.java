import java.util.Scanner;

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

        sc.close();
    }

    public static void matrizes2(){
         Scanner sc = new Scanner(System.in);

         System.out.println("Digite a quantidade de linhas");
         int linha = sc.nextInt();

         //Criação da matriz
         System.out.println("Digite a quantidade de colunas");
         int coluna = sc.nextInt();

         int[][] mat = new int[linha][coluna];

        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0; j <  mat[i].length ; j++){
                System.out.printf("Digite o valor da: \nColuna: %d \nLinha: %d \nValor: ",j, i);
                mat[i][j] = sc.nextInt();
            }
        }

        //Buscador
        System.out.print("Digite o valor a ser procurado: ");
        int src = sc.nextInt();

        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0; j <  mat[i].length ; j++){
               
                if(mat[i][j] == src){
                    System.out.printf("Posição: %d , %d\n", i , j);

                    System.out.printf(((j - 1) < 0) ? "Left: nothing" : "Left: %d\n",  mat[i][j - 1]);
                    System.out.printf(((j + 1) > mat[i].length - 1) ? "" : "Right: %d\n",mat[i][j + 1]);
                    System.out.printf(((i + 1) > mat.length - 1) ? "" : "Down: %d\n",mat[i + 1][j]);
                    System.out.printf(((i - 1) < 0)  ? "Up: nothing" : "Up: %d\n", mat[i - 1][j]); // Erro está na prorra da 

                }
            }
        }

        sc.close();
    }
}
