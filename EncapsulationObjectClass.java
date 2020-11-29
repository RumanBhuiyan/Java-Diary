public class EncapsulationObjectClass {
    private int myPrivateValue;

    EncapsulationObjectClass() {
        System.out.println("Constructor is called!!");
    }

    public void setValue(int keep) {
        myPrivateValue = keep;
    }

    public int getValue() {
        return myPrivateValue;
    }
}
// Encapsulation means keeping variables private so that object can't access
// or modify them directly.To change or access them,object has to access
// through that class member function like get and set method
