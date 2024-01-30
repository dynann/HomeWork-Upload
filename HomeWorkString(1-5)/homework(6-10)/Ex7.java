import java.util.Scanner;

public class Ex7 {
    public static void main(String[] Args) {

        //create an object scanner and string
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        String getString = scan.nextLine();
        scan.close();

        StringBuilder cleanString = new StringBuilder(getString);


        //iterate through each character in string
        for (int i = 0; i < cleanString.length(); i++) {
            char currentChar = cleanString.charAt(i);

            //check if the first letter at the first index is lowercase then convert uppercase
            if ((i == 0) && Character.isLowerCase(currentChar)) {

                cleanString.setCharAt(i, Character.toUpperCase(currentChar));
            }

            //check if the letter of the first of word is lowercase then convert to uppercase
            else if ((i >= 1) && Character.isLowerCase(currentChar) && ((cleanString.charAt(i - 1)) == ' ')) {

                cleanString.setCharAt(i, Character.toUpperCase(currentChar));
            }

            //check if the letter that is not the first of word is uppercase then convert lowercase
            else if ((i >= 1) && ((cleanString.charAt(i - 1)) != ' ') && (Character.isUpperCase(currentChar)))  {

                cleanString.setCharAt(i, Character.toLowerCase(currentChar));
            }
        }

        //display clean string
        System.out.println("Old String : " + getString);
        System.out.println("Clean String : " + cleanString);
    }
}
