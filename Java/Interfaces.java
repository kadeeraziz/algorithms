public class Interfaces implements Printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Interfaces obj = new Interfaces();
        obj.print();
    }
}
    



interface Printable {
    void print();
}
