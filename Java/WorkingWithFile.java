
import java.io.*;

class WorkingWithFiles {

    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1, "A", 20);

        // create a file named "student.txt" in same directory
        File file = new File("student.txt");

        // write te s1 object to the file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();

    }
}

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