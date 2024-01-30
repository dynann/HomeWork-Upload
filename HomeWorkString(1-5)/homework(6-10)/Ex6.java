/*Group 12
   -Ra Phearom
   -Phan Sovannarith
   -Ran Fidynann
   -Yang Sokkheang  */

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // Call the removeDuplicates method and print the result
        String result = removeDuplicates(str);
        System.out.println("Result: " + result);
        
        scanner.close();
    }

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String str) {
        // StringBuilder to store the result
        StringBuilder sb = new StringBuilder();
        
        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            // Check if the lowercase or uppercase version of the current character is not already present in the result
            if (sb.indexOf(String.valueOf(c).toLowerCase()) == -1 && sb.indexOf(String.valueOf(c).toUpperCase()) == -1) {
                // Append the character to the result StringBuilder
                sb.append(c);
            }
        }
        
        // Return the result as a string
        return sb.toString();
    }
}






