public class InterfaceAccessingClass implements Interface1 {

    public void add(int a, int b) {
        System.out.println("Summation : " + (a + b));
    }

    public void multiply(int a, int b) {
        System.out.println("Product is " + (a * b));
    }

    public static void main(String[] args) {
        InterfaceAccessingClass myObject = new InterfaceAccessingClass();
        myObject.add(5, 6);
        myObject.multiply(5, 6);
    }
}
