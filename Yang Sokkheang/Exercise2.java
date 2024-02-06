//find intersection of two array of string
public class Excerise2 {
public static void main(String[] args) {
    String[] array1 = {"apple", "banana", "orange", "kiwi", "banana"};
    String[] array2 = {"banana", "kiwi", "grape", "apple"};

    int interSize = Math.min(array1.length , array2.length);

    String[] intersection = new String[interSize];

    // Check for common elements between array2 and set1
      for( int i = 0 ; i < array1.length ; i++){
          for ( int j = 0 ; j < array2.length ; j++){
              if(array1[i] == array2[j]){
                  intersection[j] = array1[i];
              }
          }
      }

    // Display non-duplicated intersections
    System.out.println("Intersection of array1 and array2:");
    for (String s : intersection) {
        System.out.print(s + " ");
    }
   }
}
