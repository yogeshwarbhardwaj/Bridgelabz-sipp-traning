// Base class
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass (correctly representing "is-a" relationship)
public class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks.");
    }
}

// Subclass (correctly representing "is-a" relationship)
public class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited method
        myDog.bark();

        Cat myCat = new Cat();
        myCat.eat();   // Inherited method
        myCat.meow();
    }
}