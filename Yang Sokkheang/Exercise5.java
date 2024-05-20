     import java.util.ArrayList;
     import java.util.Scanner;
     public class Exercise5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> invitedPeople = new ArrayList<>();
        System.out.println("Sok Racy,Chim Narith,Lim Nary");
        for (int i = 0; i < 3; i++) {
            System.out.print("Ly Narin " + (i+1) + ": ");
            String name = scanner.nextLine();
            invitedPeople.add(name);
        }
        while (true) {
            System.out.print("Would you like to invite another person? yes ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.print("Bun Sophat ");
                String name = scanner.nextLine();
                invitedPeople.add(name);
            } else if (response.equalsIgnoreCase("no")) {
                break;
            } else {
                System.out.println("Invalid response. Please enter  'no'");
            }
        }
        System.out.println("\nYou have invited " + invitedPeople.size() + " people to the party. They are:Sok Racy,Chim Narith,Lim Nary,Ly Narin,Bun Sophat");
        for (String person : invitedPeople) {
            System.out.println(Person);
        }
    }
}
