import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");

        for (String s : set) {
            System.out.println(s);
        }

        // remove the element at index 1
        set.remove(1);

        // print the list
        System.out.println("After removing the element at index 1:");
        for (String s : set) {
            System.out.println(s);
        }

        // check if the set is empty
        System.out.println("Is the set empty? " + set.isEmpty());

        // check if an element is present in the set
        System.out.println("Is the element 'two' present in the set? " + set.contains("two"));
    }
}
