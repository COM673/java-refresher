# Java Refresher
Repro: java-refresher  
Repository for first session of COM673, focusing on Java refresher for the upcoming Java on Azure content

## Introduction
In this module the focus will be on designing, developing, debugging and deploying Java apps and bots on the Azure cloud.  
Let's start with a Java refresher. We'll be using Java 10, so some of the latest language features may be new to you.  
   
### Basic language features 
Many programming languages have variables, input and output, selection, and loops as basic features for writing programs.

#### Variables
Simple variables have a type, name and value:
 ```java
 int x = 2;
 double y = 7.5;
 boolean z = false;
 ```
 Complex variables are objects (see below) that encapsulate data and methods to work with them:
 ```java
String sentence = "The quick red fox";
int sentenceLength = words.length();
```
In this example, a *String* contains the data for the sentence, and *.length()* is a method that return the number of characters in the sentence.  
Java 10 adds type inference, if you use *var* as the type, Java will attempt to infer the type for you. This is particularly useful for verbose types.  
 ```java
 var sentence = "This is a String type";
 ```

#### Input and Output
Although we'll only be using print statements at the start of the course, we can print with:
```java
 System.out.println("print this and go onto a new line");
 System.out.print("print this and stay on the current line");
 ```
 Input used to be quite knotty but luckily the Scanner class makes it much more straight forward:
  ```java
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("What age are you " + name + "?");
        int age = input.nextInt();
        System.out.println("Do you like marmite? (true or false)");
        boolean likesMarmite = input.nextBoolean();
        System.out.printf("%s is %d years old and likes marmite: %b\n", name, age, likesMarmite);       
        input.close();   
  ```
#### Selection
#### Loops

### Object oriented programming language features
Java is an OOP language and that we need to be comfortable working with *classes* which define the structure and capabilities of something we want to use and *objects*, which are an instance of a class.  
```java
Dog roscoe = new Dog();
```
In this example, the class is **Dog** and the object is **roscoe**, a particular instance of a dog. 