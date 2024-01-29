import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        
        // Read a line of text entered by the user
        String inputString = scanner.nextLine();

        // Create a StringBuilder to store the result 
        StringBuilder result2 = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            // Get the current character in the iteration
            char currentChar = inputString.charAt(i);

            // Check if the current character is not already present in the result
            if (result2.indexOf(String.valueOf(currentChar)) == -1) {
                // If not present, append the current character to the result
                result2.append(currentChar);
            }
        }
        System.out.println("Result : " + result2.toString());
        scanner.close();
    }
}
