import java.util.ArrayList;
import java.util.Scanner;

public class ZipArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(); 
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        // prompt user to enter the number of sublists
        System.out.println("Enter the number of sublists:");
        int numOfSublists = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter elements first list:");
        for (int i = 0; i < numOfSublists; i++) {
            System.out.println("Enter elements for sublist " + (i + 1) + " separated by spaces:");
            String[] input = scanner.nextLine().split(" "); // read and split the input by spaces
            ArrayList<Integer> sublist = new ArrayList<>();
            for (String s : input) {
                sublist.add(Integer.parseInt(s)); // parse and add each element to the sublist
            }
            list1.add(sublist); // add the sublist to the first list
        }

        // prompt user to enter elements for the second list
        System.out.println("Enter elements  second list:");
        for (int i = 0; i < numOfSublists; i++) {
            System.out.println("Enter elements for sublist " + (i + 1) + " separated by spaces:");
            String[] input = scanner.nextLine().split(" "); 
            ArrayList<Integer> sublist = new ArrayList<>();
            for (String s : input) {
                sublist.add(Integer.parseInt(s)); // parse and add each element to the sublist
            }
            list2.add(sublist); // add the sublist to the second list
        }
        // zip the two lists together
        ArrayList<ArrayList<Integer>> zippedList = zipLists(list1, list2);
        // print the zipped list
        System.out.println("Zipped list: " + zippedList);
        scanner.close(); 
    }

    // method to zip two lists of sublists together
    public static ArrayList<ArrayList<Integer>> zipLists(ArrayList<ArrayList<Integer>> list1, ArrayList<ArrayList<Integer>> list2) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        // iterate through the sublists
        for (int i = 0; i < list1.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.addAll(list1.get(i)); // add elements from first list's sublist
            temp.addAll(list2.get(i)); // add elements from second list's sublist
            result.add(temp); 
        }

        return result; 
    }
}

