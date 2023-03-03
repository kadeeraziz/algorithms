import java.util.*;

public class ArrayLList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        for (String s : list) {
            System.out.println(s);
        }

        // remove the element at index 1
        list.remove(1);

        // print the list
        System.out.println("After removing the element at index 1:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
