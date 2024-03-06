package javaExercise;
import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args){
        double[][] points = {{-1, 0}, {-1, -1}, {4, 1}, {2, 0.5}, {2.5, 2},
                             {3, 1.5}, {-1.5, 4}, {5.5, 4}};
        
        double measured_length = 0;
        double current_length = 0;
        double current_long = 0;
        int current_measure_point = 0;
        int current_point = 0;
        for(int i = 0 ; i < points.length; i++){
      
            
            for(int j = i + 1; j < points.length - 1; j++){
                
                measured_length = Math.sqrt((Math.pow((points[i][0] - points[j][0]), 2) + Math.pow((points[i][1] - points[j][1]), 2)));
                current_length = Math.sqrt((Math.pow((points[i][0] - points[j+1][0]), 2) + Math.pow((points[i][1] - points[j+1][1]), 2)));
                if(measured_length > current_length){
                    if(current_long < measured_length){
                        current_long = measured_length;
                        current_measure_point = i;
                        current_point = j;
                    }
                    
                } else {
                    if(current_long < current_length){
                        current_long = current_length;
                        current_measure_point = i;
                        current_point = j + 1;
                    }
                    
                }
                
            }
        }

        System.out.println(current_long);
        System.out.println(Arrays.toString(points[current_measure_point]));
        System.out.println(Arrays.toString(points[current_point]));

        
    }
}
