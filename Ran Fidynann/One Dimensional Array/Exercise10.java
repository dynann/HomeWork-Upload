import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number between 0 to 999 : ");
        int getNum = input.nextInt(); // Get the input number from the user
        String hundred = "hundred"; // String representation of "hundred"

        //arrays to store string representations of digits
        String[] teenDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen", ""};
        String[] secondDigit = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty",
                "seventy", "eighty", "ninety", ""};

        //check if input number is within the valid range
        if (0 <= getNum && getNum <= 999) {

            // Extract individual digits of the input number
            int first_digit = getNum % 10;
            int b = getNum / 10;
            int second_digit = b % 10;
            int d = getNum / 100;
            int last_digit = d % 10;
            int last_two_digits = getNum % 100;

            if (getNum < 20) {
                //print the string representation directly
                System.out.println(teenDigit[getNum]);

            } else if (getNum < 100) {

                System.out.println(secondDigit[second_digit] + " " + teenDigit[first_digit]);
            } else if (getNum < 1000) {

                if (last_two_digits < 20 && first_digit != 0) {

                    //print the string representation of the hundred's place,
                    // "hundred", and the string representation of the last two digits
                    System.out.println(teenDigit[d] + " " + hundred + " " + teenDigit[last_two_digits]);

                } else if (last_two_digits < 20) {

                    if (first_digit == 0) {

                        //avoid first digit ends with 0
                        System.out.println(teenDigit[last_digit] + " " + hundred + " " + secondDigit[second_digit]);
                    } else {


                        System.out.println(teenDigit[last_digit] + " " + hundred + " " +
                                secondDigit[second_digit] + " " + teenDigit[first_digit]);
                    }

                }
            }
        } else System.out.println("invalid input");

        input.close();
    }
}
