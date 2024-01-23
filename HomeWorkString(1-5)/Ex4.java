import java.util.Scanner;

public class Ex4 {
    public static void main(String[] Args) {

        //create an object scanner
        Scanner getText = new Scanner(System.in);

        //user input string
        System.out.print("input a word or a number : ");
        String string = getText.nextLine();

        //reversed string
        String getString = "";


        //iterate from last character to begin character and add to
        //getString for reversed string
        for (int i = string.length() - 1; i >= 0; i--) {
            getString = getString + string.charAt(i);
        }

        //create a case sensitve
        String lowercaseOrignal = string.toLowerCase();
        String lowercaseReverse = getString.toLowerCase();


        //check if both lowercase and uppercase can be read backward
        if (lowercaseOrignal.equals(lowercaseReverse)) {

            System.out.println("this " + string + " is palindrome");

        } else {
            System.out.println("this " + string + " is not palindrome");
        }

    }
}
