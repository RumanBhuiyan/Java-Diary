public class MathClass {
    public static void main(String[] args) {
        System.out.println("Random number between 0 and 1: " + Math.random());
        System.out.println("Random number between 0 and 100: " + (int) (Math.random() * 100));
        System.out.println("Ceil value of 2.5: " + Math.ceil(2.5));
        System.out.println("Floor value of 2.5: " + Math.floor(2.5));
        System.out.println("round value of 2.5: " + Math.round(2.5));
        System.out.println("Converting String to integer: " + Integer.parseInt("123"));
        System.out.println("Converting integer to float: " + Float.parseFloat("2"));

    }
}