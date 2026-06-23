package oops;
/* 
    interface Payment {
    void pay(); // abstract method
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment via UPI");
    }
}

class Card implements Payment {
    public void pay() {
        System.out.println("Payment via Card");
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Payment obj = new UPI(); // abstraction
        obj.pay();
    }
}
*/


//Abstraction = > Hidding essential details and showing which is required using abstract class it can not be intantiated
abstract class Animal {
    abstract void sound();  // abstract method

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal obj = new Dog(); // abstraction
        obj.sound();
        obj.sleep();
    }
}