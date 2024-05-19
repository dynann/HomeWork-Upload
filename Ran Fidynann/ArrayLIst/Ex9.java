import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){

        //create an arraylist object
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers to list : ");
        input(list); //input integers method
        System.out.println(list);
        sort(list); //sorting integers method
        System.out.println(list);

    }

    //input integers method
    public static void input(ArrayList<Integer> list){
        Scanner intPut = new Scanner(System.in);
        for(int i = 0 ; i < 5; i++){
            list.add(intPut.nextInt());
        }
    }

    //method sorting element in arraylist using insertion sort
    public static void sort(ArrayList<Integer> list){
        for(int i = 0 ; i < list.size(); i++){
            int j = i - 1;
            int temp = list.get(i);
            while( j >= 0 && list.get(j) > temp){
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
        }
    }

}
