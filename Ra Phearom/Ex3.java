import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // create an ArrayList to store unique integers
        ArrayList<Integer> uniqueIntegers = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter integers (enter 0 to stop):");
        
        while (true) {
            // read an integer from the user
            int number = scanner.nextInt();
            
            // break the loop if the user enters 0
            if (number == 0) {
                break;
            }
            
            // check if the integer is not already in the ArrayList
            if (!uniqueIntegers.contains(number)) {
                // add the integer to the ArrayList
                uniqueIntegers.add(number);
            }
        }
        
        scanner.close();
        
        // display the ArrayList containing unique integers
        System.out.println("Unique integers entered: " + uniqueIntegers);
    }
}


