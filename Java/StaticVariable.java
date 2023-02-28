package Java;

public class StaticVariable {

    // Program of static method 
    // The static method can not use non static data member or call non-static method directly.
    // this and super cannot be used in static context.



    // Program of static block
    // Is used to initialize the static data member.
    // It is executed before main method at the time of classloading.
    static int myStaticVariable = 0;

    StaticVariable() {
        myStaticVariable++;
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        StaticVariable myObject1 = new StaticVariable();
        StaticVariable myObject2 = new StaticVariable();
        StaticVariable myObject3 = new StaticVariable();
        System.out.println(StaticVariable.myStaticVariable);
    }
}
