// Base class: Animal
class Animal {
    // Method for eating
    void eat() {
        System.out.println("This animal is eating.");
    }

    // Method for making sound
    void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

// Derived class: Dog
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }

    // Additional method specific to Dog
    void wagTail() {
        System.out.println("The dog is wagging its tail.");
    }
}

// Derived class: Cat
class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }

    // Additional method specific to Cat
    void purr() {
        System.out.println("The cat is purring.");
    }
}

// Main class to test inheritance
public class Main2 {
    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog();
        myDog.eat();           // Inherited from Animal class: Output: This animal is eating.
        myDog.makeSound();     // Overridden method in Dog class: Output: The dog barks.
        myDog.wagTail();       // Specific to Dog class: Output: The dog is wagging its tail.


        System.out.println("--------------------------------------");
        // Creating an object of the Cat class
        Cat myCat = new Cat();
        myCat.eat();           // Inherited from Animal class: Output: This animal is eating.
        myCat.makeSound();     // Overridden method in Cat class: Output: The cat meows.
        myCat.purr();          // Specific to Cat class: Output: The cat is purring.
    }
}
