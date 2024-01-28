import java.util.Scanner;

public class Ex10 {
    public static void main(String[] Args) {

        //create an object scanner
        Scanner getSentence = new Scanner(System.in);
        String sentence = getSentence.nextLine();

        //display the sentence
        System.out.println(sentence);

        //vowels string
        String vowels = "AEIOUaeiou";

        //variable for counting word, consonant, vowel, digit, and special character
        int wordsCount = 1;
        int consonantCount = 0;
        int vowelsCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;

        //iterate through each character in sentence
        for (int i = 0; i < sentence.length(); i++) {

            char currentChar = sentence.charAt(i);

            //check if the letter has white space before it then count word
            if ((i >= 1) && (sentence.charAt(i - 1) == ' ') && (Character.isLetter(currentChar))) {
                wordsCount += 1;
            }

             //check if is a letter
            if (Character.isLetter(currentChar)) {

                //check if the character is a vowel
                if (vowels.indexOf(currentChar) != -1) {
                    vowelsCount += 1;
                }
                //else it is consonant
                else {
                    consonantCount += 1;
                }
            }

            //if character is digit
            else if (Character.isDigit(currentChar)) {
                digitCount += 1;
            }
            //if character is specail character
            else {
                    specialCharacterCount += 1;
            }
        }

        //print the results
        System.out.println("Words in sentence: " + wordsCount);
        System.out.println("Consonants in sentence: " + consonantCount);
        System.out.println("Vowels in sentence: " + vowelsCount);
        System.out.println("Digits in sentence: " + digitCount);
        System.out.println("Special characters contains white space in sentence: " + specialCharacterCount);
    }
}