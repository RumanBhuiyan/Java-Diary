public class PolymorphismMainClass extends PolymorphismObjectClass {
    // PolymorphismObjectClass body has come here

    // this is called polymorphism or method overloading
    public int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    // this is called method over-riding
    public void whoAreYou() {
        System.out.println("I am PolymorphismMainClass");
    }

    public static void main(String[] args) {
        PolymorphismObjectClass ob1 = new PolymorphismObjectClass();

        System.out.println("PolymorphismObjectClass sum: " + ob1.addNumbers(3, 4));
        ob1.whoAreYou();

        // After over-riding methods
        PolymorphismMainClass ob2 = new PolymorphismMainClass();
        System.out.println("PolymorphismMainClass sum: " + ob2.addNumbers(3, 4, 5));
        ob2.whoAreYou();
    }
}
