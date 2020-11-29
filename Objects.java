
public class Objects {

    public static void main(String[] args) {
        // Creating new object of SecondClass
        SecondClass second = new SecondClass(100);
        // public variables accessing
        second.x = 6;
        System.out.println("second class public variable: " + second.x);
        System.out.println("second class final variable: " + second.counter);
        // private variable accessing
        // you can't access it like System.out.println(second.y);
        second.setPrivateValue(15);
        System.out.println("second class private variable: " + second.getPrivateValue());
        // static method accessing without creating object
        System.out.println("Static method Square : " + SecondClass.square(5));
        // accessing methods creating object
        System.out.println("Cube method from object: " + second.cube(5));
    }

}
