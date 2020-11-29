public class EncapsulationMainClass {
    public static void main(String[] args) {
        EncapsulationObjectClass myObject = new EncapsulationObjectClass();
        myObject.setValue(10);
        System.out.println("Private value is " + myObject.getValue());
    }
}
