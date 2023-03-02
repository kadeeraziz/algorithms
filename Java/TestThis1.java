

// Program of this keyword: 
// to refer current class instance variable without this!
// they won't be updated
// there is ambiguity...
  
class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
        this.rollno=rollno;  
        this.name=name;  
        this.fee=fee;  
        }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
public class TestThis1{  
    public static void main(String args[]){  
        Student s1=new Student(111,"ankit",5000f);  
        Student s2=new Student(112,"sumit",6000f);  
        s1.display();  
        s2.display();  
    }
} 





// Java doesn't have pointers like in languages such as C or C++ for several reasons:

// Memory management: Java is designed to be a high-level language that provides automatic memory management through the use of a garbage collector. This eliminates the need for manual memory management using pointers, which can lead to memory leaks and other issues if not done correctly.

// Security: Pointers can be used to access arbitrary memory locations, which can be a security risk. Java is designed to be a secure language and its design philosophy is focused on preventing security vulnerabilities. By not allowing direct memory access, Java makes it harder for attackers to exploit vulnerabilities in programs.

// Platform independence: Java programs can run on different platforms, such as Windows, Linux, and macOS, without recompiling. However, pointers can have different sizes and representations on different platforms, which can cause portability issues. By not using pointers, Java makes it easier to write platform-independent code.

// Simplicity: Java is designed to be a simple language that is easy to learn and use. The absence of pointers reduces the complexity of the language and makes it easier for beginners to learn. Additionally, Java provides a powerful and easy-to-use object-oriented programming model that makes it easier to write complex applications without the need for pointers.

// Overall, the absence of pointers in Java is a deliberate design decision that provides benefits in terms of simplicity, security, and platform independence, while also making it easier to write correct and reliable programs.