package week4;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        // create scanner obj and insert value
        Scanner input =  new Scanner(System.in);
        String hexadecimalNumber = input.nextLine();
        String symbols = "0123456789ABCDEF";
        int count = 0;
        input.close();

        // define the domain from 0 to the end of value
        for(int i = 0; i < hexadecimalNumber.length(); i++){

            // convert string to char
            char chHexadecimalNumber = hexadecimalNumber.charAt(i);

            // define the domain from 0 to the end of value
            for(int j = 0; j < symbols.length(); j++){

                // string to char
                char chSymbols = symbols.charAt(j);
                
                // to check the value of hex num is it exist in symbol or not
                if(chHexadecimalNumber == chSymbols){

                    // to count when it match each other
                    count++;
                }
            }
            
            
        }

        // if the count equal to the length of the hex num which mean it is hex num
        if(count == hexadecimalNumber.length()){

            System.out.println("YES");
        }else{
            
            System.out.println("NO");
        }

    }
}
