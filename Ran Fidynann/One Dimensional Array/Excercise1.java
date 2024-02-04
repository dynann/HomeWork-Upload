
//check if array is sorted in ascending order


import java.util.Scanner;
public class Excercise1 {
    public static void main(String[] Args) {

        //create an object scanner
        Scanner input = new Scanner(System.in);

        //recieve as a string and convert to character array
        String getUserInput = input.nextLine();
        char[] chars = getUserInput.toCharArray();
        boolean checkSort = true;

        //compare value to value of its next index
        //if current value is bigger than its next value the loop breaks;
        for (int i = 0 ; i < chars.length - 1; i++) {

                if (chars[i] > chars[i + 1]) {
                    checkSort = false;
                    break;

            }
        }

        //check if is sorted in ascending order
        if (checkSort) {
            System.out.println("the array is sorted ascending");
        } else System.out.println("the array is not sorted");



    }
}
