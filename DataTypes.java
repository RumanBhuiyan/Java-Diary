import java.awt.*;//for using Point 

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Data types
        byte keep = 1; // byte type takes only 1 byte memory
        short number = 45; // short type takes 2 byte memory
        int age = 23; // int type takes 4 byte memory
        long distance = 1_23_4567L;// _ is used instead of , L for denoting long
        float time = 12.23F;// F for denoting float numbers

        System.out.println("byte type value: " + keep);
        System.out.println("short type value: " + number);
        System.out.println("int type value: " + age);
        System.out.println("long type value: " + distance);
        System.out.println("float type value: " + time);
        // primitive type only copy values.change in one not affect other
        int number2 = number;// only storing value of number to number2
        number++;// number incremented but number2 not incremented
        System.out.println(number);
        System.out.println(number2);

        // Reference Data type
        Point point1 = new Point(1, 2);// storing reference of remory to point1
        Point point2 = point1;// storing same reference of memory to point2
        System.out.println("Before :\n" + point1);
        System.out.println(point2);
        point1.x = 2;// thats why changes in reference memory value reflected
        System.out.println("After :\n" + point1);
        System.out.println(point2);
        // Implicit Type Casting
        // byte->short->int->long->float-double
        // explicit type casting
        // double x=5.5;
        // int y=(int)x+5;
    }
}
