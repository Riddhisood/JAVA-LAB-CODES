//Q23. Write a program to show method overriding.

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends
    Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

public class Q23 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();

        myAnimal.sound(); 
        myDog.sound();    
    }
}   
