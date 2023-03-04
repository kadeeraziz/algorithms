import java.util.*;

class Iteratorss {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();

        System.out.println(it.next());
        System.out.println("////////");

        while (it.hasNext()) {
            String car = it.next();
            if (car.equals("Ford")) {
                it.remove();
            }
        }

        System.out.println("Size of the list: " + cars.size());

    }
}