## 1. Hello World
```java
public class TestAll {

    public static void main(String[] args) {
        
        System.out.println("Hello world");
    }
}
```
## 2. Data types
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
## 3. Taking input 
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
## 4. Conditional Statements
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
## 5. Looping
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
## 6. Math Library
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
## 7. String Methods
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
