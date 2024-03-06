package javaExercise;

import java.util.Scanner;

public class Ex9 {
 
    public static void main(String[] args){

        //create an object scanner
        Scanner scanner = new Scanner(System.in);
        double limit = scanner.nextDouble();
        scanner.close();

        //initialize the total bank asset and its borrowers 
        double[] bank_balance = new double[]{25, 125, 175, 75, 181};
        double[][] borrowers = new double[][]{
            {0, 100.5, 0, 0, 320.5},
            {0, 0, 40, 85, 0},
            {125, 0, 0, 75, 0},
            {125, 0, 0, 0, 0},
            {0, 0, 125, 0, 0}
        };

        //contain bank true is unsafe
        boolean[] isUnsafe = new boolean[5]; 

        boolean foundUnsafe = true;
        while (foundUnsafe) {
            //loop will break after there are no more bank that go bankrupt
            foundUnsafe = false;
            for(int i = 0 ; i < bank_balance.length; i++){
                //check if the bank is already marked as unsafe
                if (!isUnsafe[i]) {
                    double asset = bank_balance[i];
                    for(int j = 0 ; j < borrowers[i].length; j++){
                        asset += borrowers[i][j];
                    }
                    if(asset < limit){
                        System.out.println("Unsafe Bank: " + i);
                        isUnsafe[i] = true; //set the bank as unsafe
                        for(int j = 0; j < 5; j++){
                            if(borrowers[j][i] > 0){
                                foundUnsafe = true;
                                borrowers[j][i] = 0;
                            }
                        }
                    }
                }
            }
        }
    }
}
