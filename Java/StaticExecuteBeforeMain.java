package Java;

class StaticExecuteBeforeMain {
    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}