/*Group 12
   -Ra Phearom
   -Phan Sovannarith
   -Ran Fidynann
   -Yang Sokkheang  */


//remove duplicated numbers in a string

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){

        //create an object scanner
        Scanner input =  new Scanner(System.in);
        String getInput = input.nextLine();

        //split input to array
        String[] array = getInput.split(" ");

        for(int i = 0; i < array.length; i++) {
            // Check if array[i] is not null
            if (array[i] != null) {

                for(int j = i + 1; j < array.length; j++) {

                    if(array[i].equals(array[j])) {
                        // turn duplicate to null
                        array[j] = null;
                    }
                }
            }
        }

        for(String q : array) {
            // Print only non-null elements
            if (q != null) {
                System.out.print(q + " ");
            }
        }
        input.close();
    }
}
