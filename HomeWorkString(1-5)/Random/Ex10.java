import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int[] survivals = new int[6]; // Array to store the number of survivals for each choice

        // todo play 100 times
        for (int i = 0; i < 100; i++) {

            // todo each game play 16 times
            for (int j = 0; j < 6; j++) {
                if (playGame(j)) {
                    survivals[j]++;
                }
            }
        }

        // todo display 
        System.out.println("Survival count for each choice:");
        for(int i = 0; i < 6; i++){
            System.out.println("case: " + (i + 1) + " = " + survivals[i]);
        }
    }

    public static boolean playGame(int choice) {

        // 0 mean black 1 white
        Random random = new Random();
        int[] bowl1, bowl2;
        
        // case
        switch (choice) {
            case 0:
                bowl1 = new int[] { 1, 1, 1 };
                bowl2 = new int[] { 0, 0, 0 };
                break;
            case 1:
                bowl1 = new int[] { 0, 0, 1 };
                bowl2 = new int[] { 1, 1, 0 };
                break;
            case 2:
                bowl1 = new int[] { 0 };
                bowl2 = new int[] { 1, 1, 1, 0, 0 };
                break;
            case 3:
                bowl1 = new int[] { 1 };
                bowl2 = new int[] { 1, 1, 0, 0, 0 };
                break;
            case 4:
                bowl1 = new int[] { 1, 1 };
                bowl2 = new int[] { 0, 0, 0, 1 };
                break;
            case 5:
                bowl1 = new int[] { 0, 0 };
                bowl2 = new int[] { 0, 1, 1, 1 };
                break;
            default:
                return false;
        }

        int[] chosenBowl = (random.nextInt(2) == 0) ? bowl1 : bowl2;
        return chosenBowl[random.nextInt(chosenBowl.length)] == 1;
    }
}
