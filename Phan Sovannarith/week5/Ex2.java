import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        String[] array1 = new String[3];
        String[] array2 = new String[3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string1: ");
        for (int i = 0; i < 3; i++) {
            array1[i] = input.nextLine();
        }

        System.out.println("Enter string2: ");
        for (int i = 0; i < 3; i++) {
            array2[i] = input.nextLine();
        }
        input.close();

        System.out.println("The intersection:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
