public class Exercise2 {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "orange", "kiwi"};
        String[] array2 = {"banana", "kiwi", "grape", "apple"};

        int interSize = Math.min(array1.length, array2.length);

        String[] intersection = new String[interSize];

        int index = 0; // Index for the intersection array

        // Check for common elements between array2 and array1
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) { // Use .equals() for string comparison
                    intersection[index++] = array1[i]; // Add the common element to intersection
                    break; // Exit the inner loop once a match is found
                }
            }
        }

        // Display non-duplicated intersections
        System.out.println("Intersection of array1 and array2:");
        for (String s : intersection) {
            if (s != null) { // Check for null before printing
                System.out.print(s + " ");
            }
        }
    }
}
