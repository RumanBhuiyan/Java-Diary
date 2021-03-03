> ## 1. Hello World
```java
public class TestAll {

    public static void main(String[] args) {
        
        System.out.println("Hello world");
    }
}
```
> ## 2. Data types
```java
import java.awt.*;//for using Point 

public class DataTypes {
    public static void main(String[] args) {
       // Primitive Data types
        byte keep = 1; // byte type takes only 1 byte memory
        short number = 45; // short type takes 2 byte memory
        int age = 23; // int type takes 4 byte memory
        long distance = 1_23_4567L;// _ is used instead of , L for denoting long
        float time = 12.23F;// F for denoting float numbers
        
        // Reference Data type
        Point A = new Point(1, 2);
        Point B = A;
        System.out.println("Before changing : " + A);
        
        B.x = 3;
        B.y = 4;
        System.out.println("After Changing : " + A);
        
  }
}// Output: 
// Before changing : java.awt.Point[x=1,y=2]
//After Changing : java.awt.Point[x=3,y=4]
```

> ## 3. Type Casting
```java
        // Implicit Type Casting byte(1)->short(2)->int(4)->long(8) etc
        byte   a = 3;
        short  b = a;//a converted into short
        int    c = b;// b converted into int 
        long d = c;//c converted into long
        
        // explicit type casting 
        System.out.println("Type Cast Double to int: " + (int) 3.95);
```

> ## 4. Taking input 
```java
import java.util.Scanner;
public class TestAll {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.print("You Entered "+a);//print() doesn't print newline after output but println() does
        input.close();
    }
}
```
> ## 5. Conditional Statements
```java
        // Ternary Operator
        int num = 5;
        System.out.println(num > 0 ? "positive" : "negative");

        // if else statement
        if (num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }

        // if-elseif-else ladder
        if (num == 0) {
            System.out.println("Number is 0");
        } else if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        // switch statement
        int tracker = num == 0 ? 0 : num > 0 ? 1 : -1;
        switch (tracker) {
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is positive");
                break;
            default:
                System.out.println("Number is negative");
        }
```
> ## 6. Looping
```java
        // for loop
        for (int i = 0; i < 5; i++)
            System.out.println("i: " + i);

        // while loop
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // do-while loop
        int k = 0;
        do {
            System.out.println("k : " + k);
            k++;
        } while (k < 5);

        // For-each loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int keep : numbers) 
            System.out.println("keep : " + keep);        
```
> ## 7. Math Library
```java
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Random number between 0 and 100: " + (int) (Math.random() * 100));
        System.out.println("Max between 2 & 5: " + Math.max(2, 5));
        System.out.println("Min between 2 & 5: " + Math.min(2, 5));
        System.out.println("Absolute value of -5: " + Math.abs(-5));
        System.out.println("Ceil value of 2.5: " + Math.ceil(2.5));
        System.out.println("Floor value of 2.5: " + Math.floor(2.5));
        System.out.println("round value of 2.5: " + Math.round(2.5));
        System.out.println("Converting String to integer: " + Integer.parseInt("123"));
        System.out.println("Converting integer to float: " + Float.parseFloat("2"));
        System.out.println("Converting string to double: " + Double.parseDouble("2"));
```
> ## 8. String Methods
```java
        String name = "Ruman Bhuiyan";
        System.out.println("Is String empty : " + name.isEmpty());
        System.out.println("String Length: " + name.length());
        System.out.println("Index of a character: " + name.indexOf('R'));
        System.out.println("Lower Case: " + name.toLowerCase());
        System.out.println("Upper Case : " + name.toUpperCase());
        System.out.println("Removing extra spaces : " + name.trim());
        System.out.println("Replacing a character: " + name.replace('R', 'B'));
```
> ## 9. Threads 
> ### Threads can be created in two way  i)extending Threads class  ii) implementing Runnable interface
```java
    // Process 01
    public class TestAll extends Thread{

    public String name;
    public int time;

    public static void main(String[] args) {

        TestAll t1 = new TestAll("Ruman", 2000);
        t1.start();
    }

    // Initializing variables by calling its constructor
    TestAll(String name,int time){
        this.name=name;
        this.time=time;
    }

    // Thread.start() will call this method
    public void run() {
         try{
            System.out.println("Hello");
            Thread.sleep(time);
            System.out.println(name);
        } catch (Exception e) {
             System.out.println(e);
         }
        
    }
}

```
```java
    // Process 02
    public class TestAll implements Runnable{

    public String name;
    public int time;

    public static void main(String[] args) {
        
        TestAll test = new TestAll("Ruman", 2000);
        Thread t1 = new Thread(test);
        t1.start();
    }

    // Initializing variables by calling its constructor
    TestAll(String name,int time){
        this.name=name;
        this.time=time;
    }

    // Thread.start() will call this method
    public void run() {
         try{
            System.out.println("Hello");
            Thread.sleep(time);
            System.out.println(name);
        } catch (Exception e) {
             System.out.println(e);
         }
        
    }
}

```
> ### If thread is created by using `extends Threads` then main class gets all property of Threads so we don't need to create an instance of Thread class and pass object of main class to it .Just we have to override `run()` method to say explicitely what to do when `thread.start()` gets called. On the other hand if thread is made by using `implements Runnable` then its required to create an instance of Thread class and pass object of main class to it and `run()` method will remain same alike before. Look if we create thread by `extends Thread` then we can't extend other classes but implement other interfaces.Again if we create thread by `implements Runnable` then we can extend other class too.Thread class  provides some inbuilt methods like `yield()`, `interrupt()` etc. that are not available in Runnable interface.Using runnable will give you an object that can be shared amongst multiple threads. 
> ### Concurrency Problems : As threads run at the same time as other parts of the program, there is no way to know in which order the code will run. When the threads and main program are reading and writing the same variables, the values are unpredictable. The problems that result from this are called concurrency problems.
```java

    public class TestAll extends Thread {
    
    public static int count = 0;
    public static void main(String[] args) {
        
        TestAll t1 = new TestAll();
        t1.start();
        System.out.println("count : " + count);
        count++;
        System.out.println("count : " + count);
        }

    // Thread.start() will call this method
    public void run() {
        count++;
    }
}
// outut: 
// count : 0
// count : 2
```
> ### Solving Concurrency Problem
```java

    public class TestAll extends Thread {
    
    public static int count = 0;
    public static void main(String[] args) {
        
        TestAll t1 = new TestAll();
        t1.start();
        while (t1.isAlive()); //dont execute next line untill t1 finished
        System.out.println("count : " + count);
        count++;
        System.out.println("count : " + count);
        }

    // Thread.start() will call this method
    public void run() {
        count++;
    }
}
// outut: 
// count : 1
// count : 2
```
