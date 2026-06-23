package oops;

abstract class Animal {
    abstract void sound();
}

// Inheritance + Encapsulation
class Dog extends Animal {
    private String name;   // Encapsulation

    Dog(String name) {
        this.name = name;
    }

    // Polymorphism (method overriding)
    void sound() {
        System.out.println(name + " barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
public class ALL_OOP {
    public static void main (String [] args)
    {
        Animal obj = new Dog("Tommy");// runtime polymorphism
        Animal obj1 = new Cat();
        
        obj.sound();
        obj1.sound();
    }
}
