import java.util.ArrayList;
import java.util.Iterator;

public class Exercise4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);

        System.out.println("Original list: " + list);
        removeInt(2, list);
        System.out.println("List after removal: " + list);
    }

    public static void removeInt(int value, ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == value) {
                iterator.remove();
            }
        }
    }
}