

//  A password must have exactly 8 characters.
//  A password must consist of only digits and letters.
//  A password must always start with a digit.
//  A password must contain at least one uppercase letter.


import java.util.Scanner;
public class Ex8 {
    public static void main(String[] Args) {

        //create an object scanner and string
        Scanner _getPassword = new Scanner(System.in);
        System.out.print("Enter Passwords : ");
        String _password = _getPassword.nextLine();

        boolean checkLetterOrDigit = false;
        boolean checkDigit = false;
        boolean checkCharacter = false;

        //first condition if it has exatly 8 characters


        //count uppercase letter
        int count = 0;

        //check if the it has more or less than 8 characters
        if (_password.length() != 8){
            System.out.println("password must have 8 characters");
            checkCharacter = true;
        }
        //iterate through each character in given string

        if (_password.length() != 0) {
            for (int i = 0; i < _password.length(); i++) {

                char _currentChar = _password.charAt(i);

                //check if character is not letter or digit


                if (!(Character.isLetterOrDigit(_currentChar)) && !checkLetterOrDigit) {

                    //alert user
                    System.out.println("password must consist of only letters and digits");
                    checkLetterOrDigit = true;

                }

                //check if the first letter of password doesn't start with digit
                if ((i == 0) && !(Character.isDigit(_currentChar))) {
                    System.out.println("password must always start with a digit");
                    checkDigit = true;
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

            //if password is valid
            if (count >= 1 && !checkLetterOrDigit && !checkDigit && !checkCharacter) {

                //alert user if password is valid
                System.out.println("password is valid");
            }


            //if user enters password more than or less than 8 characters
        }
        ;
    }
}
