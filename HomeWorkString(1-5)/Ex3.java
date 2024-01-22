import java.util.Scanner;

public class Ex3 {
    public static void main(String[] Args){

        //create an object scanner
        Scanner getString = new Scanner(System.in);

        //recieve a string from user input
        System.out.print("input string : ");
        String stirngRecieve = getString.nextLine();

        //string that no consonants
        StringBuilder remove_consonant = new StringBuilder();

        //convert string to character array
        char[] chars = stirngRecieve.toCharArray();

        //iterater through character array
        for(int i = 0 ; i < chars.length ; i++){

            //assign character at a specific index to c
            char c = chars[i];

            //check if is not consonant then add to new string
            if((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == ' ')){


                //add character to stringbuilder
                remove_consonant.append(c);
            }

        }

        //display new string with no consonants
        System.out.print("After removed consonants : ");
        System.out.println(remove_consonant);
    }
}
