package SingleDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // todo create a variable to store the value string
        Scanner input = new Scanner(System.in);
        String array = input.nextLine();
        input.close();

        // todo remove whitespace
        array = array.replaceAll(" ", "");

        // todo remove duplicate numbers
        StringBuilder obj = new StringBuilder(array);

        for (int i = 0; i < obj.length(); i++) {
            char ch1 = obj.charAt(i);

            for (int j = i + 1; j < obj.length(); j++) {
                char ch2 = obj.charAt(j);

                if (ch1 == ch2) {
                    obj.deleteCharAt(j);
                    j--;
                }
            }
        }

        // todo convert to an array
        int[] arrayNum = new int[obj.length()];

        // todo calculate the unicode value and convert to array
        for (int i = 0; i < obj.length(); i++) {
            arrayNum[i] = obj.charAt(i) - '0'; 
            System.out.println(obj.charAt(i));
        }

        Arrays.sort(arrayNum);

        // todo print the sorted array
        for (int num : arrayNum) {
            System.out.print(num + " ");
        }
    }
}
