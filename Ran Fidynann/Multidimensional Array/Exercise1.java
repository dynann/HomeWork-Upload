import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){

        //create an object scanner and declare 3x3 matrix
        Scanner input =  new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] sumMatrix = new int[3][3];

        //get user input for matrix 1
        System.out.println("Input Matrix 1 : ");
        for(int i = 0 ; i < 3; i++){
            for(int j = 0 ; j < 3; j++){
                matrix1[i][j] = input.nextInt();
            }
        }

        //get user input matrix 2
        System.out.println("Input Matrix 2 : ");
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3; j++){
                matrix2[i][j] = input.nextInt();
            }
        }

        //sum of two matrix
        for(int i = 0  ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        //display matrix
        for(int i = 0 ; i < 3 ; i++){

            //display matrix 1
            for(int j = 0 ; j < 3; j++){
                System.out.print(matrix1[i][j] + "  ");
                if(i == 1 & j == 2){
                    System.out.print(" +   ");
                } else if( i != 1 & j == 2){
                    System.out.print("     ");
                }
            }

            //display matrix 2
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(matrix2[i][j] + "  ");
                if(i == 1 & j == 2){
                    System.out.print("  =   ");
                } else if( i != 1 & j == 2){
                    System.out.print("      ");
                }
            }

            //display sum matrix
            for(int j = 0 ; j < 3; j++){
                System.out.print(sumMatrix[i][j] + "  ");
            }

            System.out.println();


        }

        input.close();
    }
}
