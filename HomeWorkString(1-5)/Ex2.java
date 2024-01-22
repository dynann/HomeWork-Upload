import java.util.Scanner;

public class Ex2 {
    public static void main(String[] Args){

        //creat a scanner object
        Scanner string_Input = new Scanner(System.in);

        //declare a string recieve
        String string_Recieve = string_Input.nextLine();

        //declare a string builer for adjusting string
        StringBuilder string_Clean = new StringBuilder();

        //convert recieve string to character array
        char[] chars = string_Recieve.toCharArray();

        //iterate through each character
        for(int i  = 0 ; i < chars.length; i++){

            //initialize c by assign each character
            char c = chars[i];

            //check if it is uppercase letter not the first or it already has space before it
            if((i > 0) && (Character.isUpperCase(chars[i])) && (chars[i-1] != ' ')){

                //add one blank space before uppercase letter
               string_Clean.append(' ');
            }

            //add each character to string clean
            string_Clean.append(c);
        }

        //display unchanged string
        System.out.print("before adjusting : ");
        System.out.println(string_Recieve);

        //after add space to string
        System.out.print("after adjusting : ");
        System.out.print(string_Clean);
    }
}
