# Java Polymorphism
    Polymorphism is one of the fundamental concepts of Object-Oriented Programming (OOP) in Java. 
    It allows objects of different classes to be treated as objects of a common superclass, 
    enabling a single interface to represent different underlying forms (data types). 
    The term "polymorphism" means "many forms."
## Types of Polymorphism in Java

    There are two main types of polymorphism in Java:

    Compile-time Polymorphism (Static Polymorphism): Achieved through method overloading. 
                    The method to be called is determined at compile-time.

    Runtime Polymorphism (Dynamic Polymorphism): Achieved through method overriding. 
                    The method to be called is determined at runtime.

## Compile-time Polymorphism (Method Overloading)
    Method overloading occurs when two or more methods in the same class have the same 
    name but different parameters (different type, number, or order of parameters).
    
    public class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    }

## Runtime Polymorphism (Method Overriding)
    Method overriding occurs when a subclass provides a specific implementation of a method 
    that is already defined in its superclass. This allows the subclass to have its own behavior 
    for the method while maintaining the same method signature.

    // Superclass
    public class Animal {
    // Method to be overridden
    public void makeSound() {
    System.out.println("The animal makes a sound");
    }
    }
    
    // Subclass 1
    public class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
    System.out.println("The dog barks");
    }
    }
    
    // Subclass 2
    public class Cat extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
    System.out.println("The cat meows");
    }
    }

## Key Concepts of Polymorphism
    Polymorphic Reference: A reference variable of a superclass can refer to an object of any of 
                            its subclasses. This allows for flexible and reusable code.

    Method Overriding: Subclasses can provide specific implementations for methods defined in 
                        the superclass. This is crucial for achieving runtime polymorphism.

    Dynamic Method Dispatch: The process of selecting the appropriate method to call at 
                        runtime is known as dynamic method dispatch. This is what enables runtime 
                        polymorphism.

## Benefits of Polymorphism

    Code Reusability: Polymorphism allows for writing more generic and reusable code.

    Maintainability: By using polymorphism, you can add new classes with new functionalities 
                    without altering the existing code, which improves maintainability.

    Flexibility: It provides the flexibility to design systems that can handle various types 
                    of objects in a uniform way.
##  Example: Using Polymorphism with Interfaces
    Polymorphism is also achieved through interfaces, where multiple classes implement 
    the same interface but provide different implementations of the interface methods.
    
    // Interface
    interface Shape {
    void draw();
    }
    
    // Class implementing the interface
    class Circle implements Shape {
    @Override
    public void draw() {
    System.out.println("Drawing a Circle");
    }
    }
    
    // Another class implementing the interface
    class Rectangle implements Shape {
    @Override
    public void draw() {
    System.out.println("Drawing a Rectangle");
    }
    }

## Practical Use Cases of Polymorphism

    Design Patterns: Polymorphism is heavily used in design patterns like Strategy, 
                    Factory, and Observer patterns.
    Frameworks: In frameworks like Spring, polymorphism allows the framework to 
                inject different types of objects (dependencies) at runtime.
    GUI Applications: Polymorphism is used in event handling where a common interface 
                can handle different types of events.
## Important Points to Remember

    Polymorphism and Casting: When dealing with polymorphic references, you might sometimes 
                    need to cast an object back to its original class to access specific 
                    methods or properties not available in the superclass.

    Animal myAnimal = new Dog();
    Dog myDog = (Dog) myAnimal;  // Downcasting to Dog
    myDog.bark();  // Now you can call methods specific to Dog

## Abstract Classes and Methods: 
    Abstract classes and methods are often used to achieve polymorphism. 
    An abstract class can have abstract methods that must be implemented by subclasses, 
    providing a common interface for different implementations.

    Polymorphism is a powerful feature in Java that enables flexible, scalable, and maintainable 
    code by allowing objects to be treated based on their superclass or interface rather than 
    their specific class.
