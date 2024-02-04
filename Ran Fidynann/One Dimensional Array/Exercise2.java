//find the intersection of two array of string


import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //create an object scanner
        Scanner input = new Scanner(System.in);

        //variable for counting intersection of both string
        int interSize = 0;


        //get user input array of string 1
        System.out.print("enter size of array string 1 : ");
        int size1 = input.nextInt();

        //create next line for new input
        input.nextLine();
        String[] string1 = new String[size1];


        for (int i = 0; i < string1.length; i++) {
            System.out.print("enter string at index " + i + " : ");
            string1[i] = input.nextLine();
        }

        //get user input array of string 2
        System.out.print("enter size of array string 2 : ");
        int size2 = input.nextInt();
        input.nextLine();
        String[] string2 = new String[size2];

        for(int i = 0 ; i < string2.length ; i++){
            System.out.print("enter string at index " + i + " : ");
            string2[i] = input.nextLine();
        }

        //display array of string 1
        System.out.println("Array of String 1 : ");
        System.out.print("[");
        for (String A : string1) {

            if (A != string1[string1.length - 1]) {
                System.out.print(A + ", ");
            } else System.out.print(A);
        }
        System.out.println("]");


        //displa array of string 2
        System.out.println("Array of String 2 : ");
        System.out.print("[");
        for (String A : string2) {

            if (A != string2[string2.length - 1]) {
                System.out.print(A + ", ");
            } else System.out.print(A);
        }
        System.out.println("]");
        input.close();

        //create a string array and get possible
        // intersection size of both string
        int maxSize = Math.min(size1, size2);
        String[] intersection = new String[maxSize];


        //checking intersection of both array string
        for(int i = 0 ; i < string1.length ; i++){

            for(int j = 0 ; j < string2.length ; j++){

                if(string1[i].equalsIgnoreCase(string2[j])){

                     intersection[interSize] = string1[i];
                      interSize++;
                }
            }
        }

       //display intersection of both string
        System.out.println("Intersection of both String :");
        System.out.print("[");
         for(int i = 0 ; i < interSize ; i++){
              if( i != interSize - 1){
                  System.out.print(intersection[i] + ", ");
              } else System.out.print(intersection[i]);
         }
        System.out.println("]");

    }
}
