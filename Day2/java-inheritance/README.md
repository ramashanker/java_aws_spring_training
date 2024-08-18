## Basic Concepts of Inheritance
    Superclass (Parent Class): The class whose properties and methods are inherited by another class.
    Subclass (Child Class): The class that inherits properties and methods from another class.

## Why Use Inheritance

    Code Reusability: Inheritance allows you to reuse code from an existing class, 
                    reducing redundancy.
    Method Overriding: A subclass can modify or extend the behavior of methods inherited 
                    from the superclass.
    Polymorphism: Inheritance enables polymorphism, allowing objects to be treated as 
                    instances of their parent class, making the code more flexible and scalable.

## How to Implement Inheritance in Java

    In Java, inheritance is implemented using the extends keyword.


##  Key Points about Inheritance
    Single Inheritance: Java supports single inheritance, meaning a class can only inherit 
                        from one superclass. However, a superclass can have multiple subclasses.

    Method Overriding: A subclass can provide a specific implementation of a method that 
                        is already defined in its superclass. This is known as method overriding. 
                        The @Override annotation is used to indicate that a method is overriding 
                        a method from the superclass.

    super Keyword: The super keyword is used to refer to the superclass. 
                    It can be used to call the superclass's constructor and methods. For example:

    super(brand, year); calls the constructor of the superclass.
    super.startEngine(); calls a method from the superclass.
    
    Protected Members: Members of a class with the protected access modifier can be accessed 
                        by the subclass, even if they are in different packages.

    Constructors in Inheritance: When a subclass is instantiated, the constructor of the 
                    superclass is called first, either implicitly or explicitly using super(). 
                    If you don't call super() explicitly, the Java compiler automatically 
                    inserts a call to the no-argument constructor of the superclass.

## Inheritance Hierarchies
    You can have multiple levels of inheritance


##  Limitations and Best Practices
    Avoid deep inheritance hierarchies: They can make the code difficult to maintain. 
                                    Favor composition over inheritance when appropriate.
    Use final keyword: If you want to prevent a class from being subclassed, 
                        you can declare it as final. Similarly, methods can be declared final to prevent them from being overridden.

    public final class Vehicle { ... }  // Cannot be subclassed
    public final void startEngine() { ... }  // Cannot be overridden
    Inheritance is a powerful feature in Java that promotes code reuse and polymorphism but 
                            should be used judiciously to maintain code clarity and simplicity.