
//check if string is subset
import java.util.Arrays;
   public class Exercise4 {
       public static void main(String[] args){

           //initialization of 2D arrays
           int[][] array = {{1,3}, {13,15,17}}; //subset array
           int[][] general_array = {{1,3}, {5,7}, {9, 11}, {13,15,17}};
           int countCorrect = 0 ;

           //iterate through each element general-array general array
           for(int i = 0 ; i < general_array.length; i++){

               //convert to each element to string for comparing
               String s1 = Arrays.toString(general_array[i]);
               for(int j  = 0 ; j < array.length; j++){
                   String s2 = Arrays.toString(array[j]);
                   if(s1.equals(s2)){
                       countCorrect++; //checking if thay are equal to each length
                   }
               }
           }

           //checking and displaying
           if(countCorrect == array.length){
               String arrays1 = Arrays.deepToString(array);
               String arrays2 = Arrays.deepToString(general_array);
               System.out.print(arrays1 + " is subset a subset of " + arrays2);
           }
       }
    }


