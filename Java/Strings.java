package Java;

public class Strings {
    public static void main(String[] args) {
        String name = "John";
        String name2 = "John";
        String name3 = new String("John");
        String name4 = new String("John");

        System.out.println(name == name2); // true
        System.out.println(name == name3); // false
        System.out.println(name3 == name4); // false

        System.out.println(name.equals(name2)); // true
        System.out.println(name.equals(name3)); // true
        System.out.println(name3.equals(name4)); // true

        System.out.println(name.compareTo(name2)); // 0
        System.out.println(name.compareTo(name3)); // 0
        System.out.println(name3.compareTo(name4)); // 0

        
    }
}
