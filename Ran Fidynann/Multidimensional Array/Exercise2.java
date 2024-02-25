package MultiArray;

public class Exercise2 {
    public static void main(String[] args) {

        //initialization of matrix
        int[][] matrix = {
                {1,  2,   3,  4,  5},
                {5,  6,   7,  8,  9},
                {9,  10, 11, 12, 13},
                {13, 14, 15, 16, 17},
        };


        //iterate from upper to half matrix
        for (int i = 0; i < matrix.length; i++) {
            int row = i;
            int col = 0;
            while (row >= 0) {
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
            System.out.println();
        }

        //iterate from half to bottom
        for (int j = 1; j < matrix[0].length; j++) {
            int row = matrix.length - 1;
            int col = j;
            while (col < matrix[0].length) {
                System.out.print(matrix[row][col] + " ");
                row--;
                col++;
            }
            System.out.println();
        }
    }
}
