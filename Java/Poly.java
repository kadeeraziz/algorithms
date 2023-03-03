
// Runtime polymorphism or Dynamic Method Dispatch is a process in which 
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Bike {
    int speed = 50;

    void run() {
        System.out.println("Bike is running at " + speed + " kmph");
    }
}

class Splendor extends Bike {
    int speed = 100;

    void run() {
        System.out.println("Splendor is running at " + speed + " kmph");
    }
}

public class Poly {
    public static void main(String[] args) {
        Bike b = new Splendor();
        b.run();
    }
}
