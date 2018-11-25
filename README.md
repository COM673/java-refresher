# Java Refresher
Repo: java-refresher  
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
#### Operators
Operators allow you to perform operations on variables, including mathematical operations and Boolean logic operations. Remember BODMAS for evaluating complex statements with brackets:
```java
int a = 2;
int b = 3;
int c = a + b;
int d = c - a;
int e = d * d;
int f = ((a * 2) * ((b + 1) / a)) / 2; // BOMDAS
``` 
We'll also look at comparison operators when we get to *selections* below. 
#### Input and Output
Although we'll only be using print statements at the start of the course, we can print with:
```java
 System.out.println("print this and go onto a new line");
 System.out.print("print this and stay on the current line");
 ```
 Input used to be quite knotty but luckily the Scanner class makes it much more straightforward:  
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
*if*, *if-else*, and *if-else if-else* statements are common when deciding what to do in a program. Each *execution path* should be considered when writing a selection, just because a particular path is unlikely, does not mean it will never happen.
```java
boolean a = true;
boolean b = false;
// == simple variable comparison
// && Boolean AND
if(a == true && b == true) {
    System.out.println("a is true, b is true");
}
else if(a == false && b == false) {
    System.out.println("a is false, b is false");
}
else if(a == true && b == false) {
    System.out.println("a is true, b is false");
}
else if(a == false && b == true) {
    System.out.println("a is false, b is true");
}
String first = "Cat";
String second = "Dog";
// .equals() compares the contents of the objects
if(first.equals(second) == true) {
    System.out.println(first + " is the same as " + second);
}
else {
    System.out.println(first + " is not the same as " + second);
}
```

#### Loops
A loop performs a certain action a number of times until a stop condition is met.  
We have *do-while* loops which run through the loop at least once, *while* loops that may not run through the loop at all, *for* loops which execute a set number of times and *for-each* loops which are useful for iterating over lists.
```java
int stopVal = 100;
int val = 200;
do
{
    System.out.println(val);
    val += val;
}
while(val < stopVal);
val = 2;
while(val < stopVal)
{
    System.out.println(val);
    val *= val; // What does this operator do?
}
for(int i = 0; i <= 30; i+=3)
{
    System.out.print(i + ", ");
}
System.out.println();
String[] animals = { "cat", "dog", "mouse" };
for(var animal : animals)
    System.out.println(animal);
}
```
### Object oriented programming language features
Java is an OOP language and that we need to be comfortable working with *classes* which define the structure and capabilities of something we want to use and *objects*, which are an instance of a class.  
```java
Dog roscoe = new Dog();
```
In this example, the class is **Dog** and the object is **roscoe**, a particular instance of a dog. 
#### Constructors & Methods
A method is a piece of code that can be called to perform some tasks. It may take parameters and may return values. A constructor is a special method that is called at object creation time.  
Example, a Gaelic Football Team class might look like this:
```java
private class GAAFootballTeam
{
    // Memeber variables
    private String name;
    private int goals;
    private int points;
    // Add Constructor
    GAAFootballTeam(String name) {
        this.name = name;
    }
    // Getter method for name
    public String getName() {
        return name;
    }
    // Setter method for goals
    public void scoreGoals(int goals) {
        this.goals = goals;
    }
    // Setter method for points
    public void scorePoints(int points) {
        this.points = points;
    }
    // Helper method to calculate total points and return value
    public int calculateTotalPoints() {
        return (goals * 3) + points;
    }
}
```
Some sample code to test the class:
```java
// This test has 2 county teams, Louth and Meath
GAAFootballTeam louth = new GAAFootballTeam("Louth County Team");
GAAFootballTeam meath = new GAAFootballTeam("Meath County Team");
// The teams play each other, and Louth scores 4 goals and 7 points
louth.scoreGoals(4);
louth.scorePoints(7);
// meath scores 3 goals and 8 points
meath.scoreGoals(3);
meath.scorePoints(8);
// A goal is worth 3 points, which team won?
int meathTotal = meath.calculateTotalPoints();
int louthTotal = louth.calculateTotalPoints();
if(louthTotal == meathTotal) {
    System.out.println("The match was a draw!");
}
else if(louthTotal < meathTotal) {
    System.out.println(meath.getName() + " won!");
}
else {
    System.out.println(louth.getName() + " won!");
}
```