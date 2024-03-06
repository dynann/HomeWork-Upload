import java.until.scaner;
    public class Exercise10  {
    public static void main(String[] args) {
        String[][] countriesAndCapitals = {
            {"Cambodia", "Phnom Penh"},
            {"Thailand", "Bangkok"},
            {"China", "Beijing"},
            {"Japan", "Tokyo"},
            {"India", "Delhi"},
            {"Malaysia", "Kuala Lumpur"}
        };

        Scanner scanner = new Scanner(System.in);
        int correctCount = 0;

        System.out.println("Welcome to the Capital City Quiz!");

        for (String[] countryAndCapital : countriesAndCapitals) {
            String country = countryAndCapital[0];
            String capital = countryAndCapital[1];

            System.out.print("What is the capital of " + country + "? ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
                correctCount++;
            } else {
                System.out.println("Incorrect. The capital of " + country + " is " + capital + ".");
            }
        }

        System.out.println("Quiz ended. You got " + correctCount + " out of " + countriesAndCapitals.length + " correct.");
    }
}

