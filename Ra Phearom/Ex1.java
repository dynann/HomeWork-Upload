import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // create a scanner object
        Scanner scanner = new Scanner(System.in);

        //  user to enter the number of element
        System.out.println("Enter the number of elements in the list:");
        int n = scanner.nextInt();

        // create an ArrayList to store the elements
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the elements of the list:");
        // read the elements from the user and add to the list
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        // print the original list
        System.out.println("Original array: " + numbers);
        // rotate the list by two slots to the right
        rotateRightByTwo(numbers);
        // print the rotated list
        System.out.println("Rotated array: " + numbers);
        
        // close the scanner
        scanner.close();
    }

    // method to rotate to right by two positions
    public static void rotateRightByTwo(ArrayList<Integer> list) {
        // If the list has 1 or fewer elements, no rotation is needed
        if (list.size() <= 1) {
            return;
        }
        // use collections.rotate 2 positions to the right
        Collections.rotate(list, 2);
    }
}



