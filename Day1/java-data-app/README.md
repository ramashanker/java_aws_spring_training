# Java data types, variables, and constants

## Primitive Data Types

    Java provides several primitive data types that serve as the building blocks for 
    data manipulation. Here are the basic primitive types:

    byte: 8-bit integer
    short: 16-bit integer
    int: 32-bit integer
    long: 64-bit integer
    float: 32-bit floating-point number
    double: 64-bit floating-point number
    char: 16-bit Unicode character
    boolean: Represents true or false

## Reference Data Types

    Reference data types in Java include classes, arrays, interfaces, and enums. 
    These types store references to objects, rather than the actual data.

## Variables

    Variables in Java are containers that hold data values. 
    They can be declared with or without initialization.

## Constants
    
    Constants are variables whose value cannot be changed once assigned. 
    In Java, constants are typically declared using the final keyword.



## Compile project

    mvn clean install


mvn archetype:generate -DgroupId=com.rama.app -DartifactId=java-data-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
