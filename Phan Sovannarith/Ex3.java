package week4;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        // create obj scanner and input to variable password
        Scanner input = new Scanner(System.in);
        System.out.println("Input the password");
        String password = input.nextLine(); // Read password from user input
        input.close();

        // to check if it is 8 characters or not
        if (password.length() == 8) {

            // use to check the first char is it a digit or not
            if (Character.isDigit(password.charAt(0))) {

                // create boolean to find if the character type is true or not
                boolean upperCase = false;
                boolean lowerCase = false;
                boolean digit = false;

                // iterate through each character in the password
                for (int i = 0; i < password.length(); i++) {
                    char ch = password.charAt(i);

                    // to check for special characters
                    if (!Character.isLetterOrDigit(ch)) {
                        System.out.println("Your password must contain numbers and letters only.");
                        System.out.println("Your password must have at least one uppercase letter, one lowercase letter, and one digit.");
                        System.out.println("Your first character must be a digit.");
                        System.out.println("Your password must have exactly 8 characters.");

                        // Exit the program as soon as a special character is found
                        return; 
                    }

                    // check uppercase, lowercase, and digit
                    if (Character.isUpperCase(ch)) {
                        upperCase = true;
                    } else if (Character.isLowerCase(ch)) {
                        lowerCase = true;
                    } else if (Character.isDigit(ch)) {
                        digit = true;
                    }
                }

                // check if all conditions are met
                if (upperCase && lowerCase && digit) {
                    System.out.println("Your password has been created successfully.");
                }
            }
        }
    }
}
