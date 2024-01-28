import java.util.Scanner;

public class Ex6 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        String getString = new String(scanner.nextLine());
        StringBuilder _cleanString = new StringBuilder(getString);
        scanner.close();

        for (int i = 0; i < _cleanString.length(); i++) {

            char _charI = _cleanString.charAt(i);

            for (int j = i + 1; j < _cleanString.length(); j++) {

                char _charJ = _cleanString.charAt(j);

                if ((_charI == _charJ) || (Character.toLowerCase(_charI) == _charJ) || (_charI == Character.toLowerCase(_charJ))) {
                    _cleanString.deleteCharAt(j);
                    j--;
                }
            }

        }

        System.out.println(_cleanString);
    }
}