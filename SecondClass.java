public class SecondClass {
    int initialValue;
    // cant be changed object
    final int counter = 5;
    // can be changed by object
    int x = 5;
    // neither accessible nor changeable by object
    private int y = 10;

    // method for objects to set private variable value
    public void setPrivateValue(int keep) {
        y = keep;
    }

    // method for objects to get private variable value
    public int getPrivateValue() {
        return y;
    }

    // Static method for any class to access it without creating object
    public static int square(int x) {
        return x * x;
    }

    // object accessible cube method
    public int cube(int x) {
        return x * x * x;
    }

    // Constructor
    SecondClass(int value) {
        initialValue = value;
        System.out.println("Second Class constructor running....");
        System.out.println("Initial Value is " + initialValue);
    }
}
// Few Notes:
// Class Access Modifiers :
// 1.final class can't be inherited by other classes
// 2. onlyh abstract class can contain abstract method
// 3. we can't create an object of abstract class

// Method Access Modifiers:
// 1. public properties are accessible to object
// 2. private properties aren't accessible to object but in class members
// 3. protected properties are accessible to same package classes
// 4. static propertiec can be accessed directy,they don't come with object
