import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Create an array of size n
        int[] array = new int[n];
        
        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Check if the array is sorted
        boolean isSorted = isSortedArray(array);

        // Display the result
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
        
        scanner.close();
    }

    // Method to check if the array is sorted in ascending order
    public static boolean isSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Compare each element with its adjacent element
            if (arr[i] > arr[i + 1]) {
                // If the current element is greater than the next one, the array is not sorted
                return false;
            }
        }
        // If the loop completes without finding an unsorted pair, the array is considered sorted
        return true;
    }
}





