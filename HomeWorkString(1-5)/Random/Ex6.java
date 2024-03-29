/*
 Group 12
 -Ra Phearom
 -Phan Sovannarith
 -Yang Sokkheang
 -Ran Fidynann
 */

public class Ex6 {

    public static void main(String[] args) {
        // Create an array of 2D points
        double[][] points = {
                {-1, 0},{-1, -1},{4, 1},{2, 0.5},{3.5, 2},{3, 1.5},{-1.5, 4},{5.5, 4}
        };

        // Initialize variables to store the farthest points and the maximum distance
        double maxDistance = 0;
        int p1 = 0, p2 = 0;

        // Loop through all pairs of points to find the farthest points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                // Calculate the distance between the current pair of points
                double distance = Math.sqrt(Math.pow(points[j][0] - points[i][0], 2) + Math.pow(points[j][1] - points[i][1], 2));
                // Update the farthest points if a new maximum distance is found
                if (distance > maxDistance) {
                    maxDistance = distance;
                    p1 = i;
                    p2 = j;
                }
            }
        }

        // Print the farthest points
        System.out.println("Farthest Points:");
        System.out.println("Point 1: (" + points[p1][0] + ", " + points[p1][1] + ")");
        System.out.println("Point 2: (" + points[p2][0] + ", " + points[p2][1] + ")");
    }
}


