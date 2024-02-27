//sort 2D array
import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args){

        //initialize 2D array
        int[][] arrays = {{4, 2}, {1, 7}, {4, 5}, {1, 2}, {3, 1}, {4, 1}, {1, 2}};

        for(int i =  0 ; i < arrays.length; i++){

            //initialize current x and y for checking
           int yCurrent = arrays[i][1];
           int xCurrent = arrays[i][0];
           int currentIndex = i; //storing index for checking if x and y were changed
           for(int j = i + 1 ; j < arrays.length; j++){
              if(yCurrent > arrays[j][1]) {
                  yCurrent = arrays[j][1];  //swap to smaller y
                  xCurrent = arrays[j][0];  //also x
                  currentIndex = j; //record the index where its values are smallest
              }
              //if both y are equal  check value x
              else if(yCurrent == arrays[j][1] && xCurrent > arrays[j][0]){
                  xCurrent = arrays[j][0]; //swap to smaller x
                  currentIndex = j;
              }
           }

           //swapping x and y to its right position
           if(currentIndex != i){
               arrays[currentIndex][1] = arrays[i][1];
               arrays[i][1] = yCurrent;
               arrays[currentIndex][0] = arrays[i][0];
               arrays[i][0] = xCurrent;

           }

        }
        //display sorted 2D array
        System.out.print(Arrays.deepToString(arrays));
    }
}
