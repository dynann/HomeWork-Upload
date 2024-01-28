import java.util.Scanner;

public class Ex9 {
    public static void main(String[] Args){
        Scanner _getValue = new Scanner(System.in);

        System.out.print("enter hexadecimal value : ");
        String _getString = _getValue.nextLine();
        String _hexadecimal = "0123456789ABCDEF.";

        int indexCount = 0 ;
        int dotCount = 0 ;

         for(int i = 0 ; i < _getString.length(); i++){

             char currentChar = _getString.charAt(i);
             if(Character.isLetter(currentChar) && Character.isLowerCase(currentChar)){
                 currentChar = Character.toUpperCase(currentChar);
             }

             for(int j = 0 ; j < _hexadecimal.length(); j++){
                 if(currentChar == _hexadecimal.charAt(j)){

                     if(currentChar == '.'){
                         dotCount += 1;
                     }
                     indexCount += 1 ;
                 }
             }
         }
         if(indexCount == _getString.length() && dotCount <= 1){
             System.out.println("Yes");
         } else System.out.println("No");
    }
}
