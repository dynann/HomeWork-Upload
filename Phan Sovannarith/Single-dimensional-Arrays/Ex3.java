import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int domain = 3;
        String[] names = new String[domain];
        int[] ages = new int[domain];
        input.close();

        for (int i = 0; i < domain; i++) {
            System.out.println("Enter name and age of person " + (i + 1) + ":");
            names[i] = input.nextLine();
            ages[i] = input.nextInt();
            // Consume the remaining newline character after nextInt()
            input.nextLine();
        }

        // Print the names and ages
        for (int i = 0; i < domain; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i]);
        }

        // Find the index of the person with the highest age
        int indexOfOldest = 0;
        int oldestAge = ages[0];
        for (int i = 1; i < domain; i++) {
            if (ages[i] > oldestAge) {
                oldestAge = ages[i];
                indexOfOldest = i;
            }
        }

        System.out.println("The name of the oldest person is: " + names[indexOfOldest]);
    }
}




