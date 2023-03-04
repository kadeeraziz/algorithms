public class GLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
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
