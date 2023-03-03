import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        int id, age;
        String name;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter id, name and age of student " + (i + 1));
            id = sc.nextInt();
            name = sc.next();
            age = sc.nextInt();
            list.add(new Student(id, name, age));
        }

        for (Student s : list) {
            System.out.println("Id: " + s.id + " Name: " + s.name + " Age: " + s.age);
        }

        sc.close();
    }
}
