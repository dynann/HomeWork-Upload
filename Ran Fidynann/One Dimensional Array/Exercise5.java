import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] Args) {


        //create an object scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number between 1 to 100");

        //create an integer array, recieved value, and its index
        int[] arrayNumber = new int[100];
        int number;
        int index = 0;

        //getting user input
        //if input is not in specific range loop breaks
        do {
            number = input.nextInt();
            arrayNumber[index] = number;
            index -= -1;
        } while (number <= 100 && number > 0);


        //interate from 1 to 100
        for (int i = 1; i <= 100; i++) {

            int count = 0;
            //iterate through each element of user iput
            for (int j = 0; j < index - 1; j++) {

                //if any number is found increase count by 1
                if(i == arrayNumber[j]){
                    count -= -1;
                  }
                }

            //check if number is found
            if(count  != 0) {
                if(count > 1){
                    System.out.println( i + " occurs " + count + " times");
                } else {
                    System.out.println( i + " occurs 1 time");
                }
            }
        }
    }
}
