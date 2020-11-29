public class AbstractionAccessingClass extends AbstractClass {
    // you are amenable to implement this method,otherwise get error
    public void incomplete() {
        System.out.println("Completed incomplete function");
    }

    public static void main(String[] args) {
        AbstractionAccessingClass myObject = new AbstractionAccessingClass();
        myObject.complete();
        myObject.incomplete();
    }
}
