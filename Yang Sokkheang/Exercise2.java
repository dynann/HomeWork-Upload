    import java.util.HashSet;
    import java.util.Set;
        public class Exercise2 {
        
     }
        public static void main(String[] args) {
            String[] array1 = {"apple", "banana", "orange", "kiwi", "banana"};
            String[] array2 = {"banana", "kiwi", "grape", "apple"};
    
            Set<String> set1 = new HashSet<>();
            Set<String> intersection = new HashSet<>();
    
            // Add elements of array1 to set1
            for (String s : array1) {
                set1.add(s);
            }
    
            // Check for common elements between array2 and set1
            for (String s : array2) {
                if (set1.contains(s)) {
                    intersection.add(s);
                }
            }
    
            // Display non-duplicated intersections
            System.out.println("Intersection of array1 and array2:");
            for (String s : intersection) {
                System.out.println(s);
            }
        }
    }    
}
