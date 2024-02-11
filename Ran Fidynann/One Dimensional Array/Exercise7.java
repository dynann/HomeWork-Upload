//find the longest word in sentence

import java.util.Scanner;

public class Exercise7{
    public static void main(String[] args){

        //create an object scanner
        Scanner input = new Scanner(System.in);
        String getString = input.nextLine();

        //split string to array string
        String[] array = getString.split(" ");
        boolean checkLetter = true;
        int countLetter = 0;


         //using insertion sort to sort string according to length
        for(int i = 1 ; i < array.length; i++){

            int j = i - 1;
            String tempString = array[i];

            //check unsorted string
            while(j >= 0 && tempString.length() < array[j].length()){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = tempString;
        }

        //iterate every string from longest length to check if it only contains letters
         for(int i = array.length - 1 ; i >= 0 ; i--){
              char[] chars = array[i].toCharArray();
              countLetter = 0;
               for(char c : chars){
                   if(Character.isLetter(c)){
                       countLetter -=-1;
                   }
               }
               //display the longest word
               if(countLetter == array[i].length()){
                   System.out.print("The Longest word is : " + array[i]);
                   break;
               }
         }
         input.close();

    }
}
