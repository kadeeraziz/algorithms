package Java;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Animal animal2 = new Dog();
        animal2.eat();
        // animal2.bark(); // error

        Animal animal3 = new Cat();
        animal3.eat();
        // animal3.meow(); // error

        // Dog dog2 = new Animal(); // error
        // Cat cat2 = new Animal(); // error
    }
}


class Animal {
    public void eat() {
        System.out.println("I am eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("I am barking");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("I am meowing");
    }
}
