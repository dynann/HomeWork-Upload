import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){

        //create an object scanner
        Scanner input = new Scanner(System.in);

        //storing names and their ages
        String[] names = new String[3];
        int[] age = new int[3];


        //get input names and ages
        for(int i = 0 ; i < 3 ; i++){

            System.out.print("Enter your name : ");
            names[i] = input.nextLine();

            System.out.print("Enter your age : ");
            age[i] = input.nextInt();
            input.nextLine();
        }

        //display their names and ages
        for(int i  = 0 ; i < 3 ; i++){
            System.out.println("name : " + names[i] + ", age : " + age[i]);
        }

        //find the youngest age by using Math.minimun between these 3 ages
        //and it will return the smallest value of these 3 value
        int youngestAge = Math.min(Math.min(age[0], age[1]), age[2]);
         for(int i = 0 ; i < 3 ; i++){
             if(youngestAge == age[i]){
                 System.out.println("The name of the youngest person is " + names[i]);
                 break;
             }
         }

    }
}
