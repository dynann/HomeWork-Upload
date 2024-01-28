import java.util.Scanner;

public class Ex8 {
    public static void main(String[] Args) {

        //create an object scanner and string
        Scanner _getPassword = new Scanner(System.in);
        System.out.print("Enter Passwords : ");
        String _password = _getPassword.nextLine();

        //first condition if it has exatly 8 characters
        if (_password.length() == 8) {

            //count uppercase letter
            int count = 0;

            //iterate through each character in given string
            for (int i = 0; i < _password.length(); i++) {

                char _currentChar = _password.charAt(i);

                //check if character is not letter or digit
                if (!(Character.isLetterOrDigit(_currentChar))) {

                    //alert user
                    System.out.println("password must consist of only letters and digits");

                }

                //check if the first character of password doesn't start with digit
                if ((i == 0) && !(Character.isDigit(_currentChar))) {

                    //alert user
                    System.out.println("password must always start with a digit");
                    return;

                }

                //uppercase counting
                if (Character.isUpperCase(_currentChar)) {

                    count++;
                }
            }

            //check if there is no uppercase letter in user's password
            if (count == 0) {

                //alert user
                System.out.println("password must contain at least one uppercase letter");
            }

            else {

                //alert user if password is valid
                System.out.println("password is valid");
            }

            //if user enters password more than or less than 8 characters
        } else System.out.println("password must have 8 characters");
    }
}
