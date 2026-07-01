package ArrayList;
import java.util.*;
public class question1 {
    public static void main(String[] args) {
        // To add the element in the arraylist.

        // Creating the new Arraylist.
        List<List<Integer>> li = new ArrayList<>();

        // Creating the List inside the arraylist.
        li.add(new ArrayList<>()); // row 0
        li.add(new ArrayList<>()); // row 1
        li.add(new ArrayList<>()); // row 2

        li.get(0).add(1);
        li.get(0).add(2);
        li.get(0).add(3);

        li.get(1).add(4);
        li.get(1).add(5);
        li.get(1).add(6);

        li.get(2).add(7);
        li.get(2).add(8);
        li.get(2).add(9);
        System.out.println(li);
        System.out.println(li.size());
    }
}
