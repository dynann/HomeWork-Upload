//check and grade the score

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {

        //create an object scanner
        Scanner input = new Scanner(System.in);

        //recieve as a string and split it to array using split method
        String stringScore = input.nextLine();
        String[] arrayScore = stringScore.split(" ");


        //iterate through each elements and check condition one by one
        for (int i = 0; i < arrayScore.length; i++) {

            //convert from string to number
            //and check condition
            int score = Integer.parseInt(arrayScore[i]);
            if (score >= 90) {
                System.out.println("Score is " + score + " and Grade is A");
            } else if (score < 90 && score >= 80){
                System.out.println("Score is " + score + " and Grade is B");
            } else if(score < 80 && score >= 70){
                System.out.println("Score is " + score + " and Grade is C");
            } else if(score < 70 && score >= 60){
                System.out.println("Score is " + score + " and Grade is D");
            } else {
                System.out.println("Score is " + score + " and Grade is F ");
            }
        }
        input.close();
    }
}

