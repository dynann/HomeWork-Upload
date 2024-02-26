import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        // Define the two arrays
        int[][] array1 = {{1, 3}, {13, 15, 17}};
        int[][] array2 = {{1, 3}, {5, 7}, {9, 11}, {13, 15, 17}};
        
        // Assume array1 is a subset of array2
        boolean isSubset = true;
        
        // Flag to track if a matching row is found in array2
        boolean found = false; 
        
        // Check each row in array1
        for (int i = 0; i < array1.length; i++) {
            found = false; 
            
            // Check each row in array2
            for (int j = 0; j < array2.length; j++) {
                // If a matching row is found in array2
                if (Arrays.equals(array1[i], array2[j])) {
                    found = true;// Set found to true if a matching row is found
                    break; 
                }
            }
            
            // If a matching row is not found in array2
            if (!found) {
                isSubset = false; // Set isSubset to false if a matching row is not found
                break;
            }
        }
        
        // Print the result
        System.out.println("Is array1 a subset of array2: " + isSubset);
    }
}





    
