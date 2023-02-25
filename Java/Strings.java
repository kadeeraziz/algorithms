package Java;

public class Strings {
    public static void main(String[] args) {
        String name = "John";
        String name2 = "Ali";
        String name3 = new String("Mohammed");
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

        // find the index of a character
        System.out.println(name.indexOf('o')); // 1

        // find the index of a character from a specific index
        System.out.println(name.indexOf('o', 2)); // 2

        // get a substring
        System.out.println(name.substring(1)); // ohn

        // convert to upper case
        System.out.println(name.toUpperCase()); // JOHN

        // convert to lower case
        System.out.println(name.toLowerCase()); // john
        
        // replace a character
        System.out.println(name.replace('o', 'a')); // Jahn

        // replace a string
        System.out.println(name.replace("oh", "aa")); // Jahn

        // concatenate strings
        System.out.println(name + " " + name2); // John Ali

        // loop through a string
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }

        // check if a string is empty
        System.out.println(name.isEmpty()); // false

        // get the binary representation of a character
        System.out.println(Integer.toBinaryString('a')); // 1100001

        // cast a character to an integer
        System.out.println((int) 'a'); // 97

        // cast an integer to a character
        System.out.println((char) 97); // a

        // cast a string to an integer
        System.out.println(Integer.parseInt("123")); // 123

        // round a double to an integer
        System.out.println((int) Math.round(1.5)); // 2

        // cast an integer to a double
        System.out.println((double) 1); // 1.0

        // get the maximum value of an integer
        System.out.println(Integer.MAX_VALUE); // 2147483647

        // get the minimum value of a float
        System.out.println(Float.MIN_VALUE); // 1.4E-45

        
    }
}
