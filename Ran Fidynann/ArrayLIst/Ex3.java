import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        //create an arraylist
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter Integers, Enter 0 for exit: ");
        int integer;
        do {

            //invoke enter method this returns an integer
            integer = enter();

            //checking if enter is duplicated
            if (integer != 0 && checkDuplicate(integer, list)) {
                list.add(integer);
            }
        } while(integer != 0);

        System.out.println(list);
    }

    //method for inputing integers
    static int enter(){
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    //check duplicated method
    static boolean checkDuplicate(int integers, ArrayList<Integer> list){
        for(int element : list){
            if(integers == element) return false;
        }
        return true;
    }
}
