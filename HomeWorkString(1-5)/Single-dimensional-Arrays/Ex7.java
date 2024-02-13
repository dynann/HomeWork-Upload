import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Split the sentence into words using regular expression
        String[] words = sentence.split("[^a-zA-Z]+");

        // Initialize a variable to store the longest word
        String longestWord = "";

        // Find the longest word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Display the longest word
        System.out.println("The longest word in the sentence is: " + longestWord);
        
        // Close the scanner to release resources
        scanner.close();
    }
}
