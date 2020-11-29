public class InheritanceMainClass extends InheritanceObjectClass {
    // everything of InheritanceObjectClass class body has come here
    public static void main(String[] args) {
        InheritanceMainClass myObject = new InheritanceMainClass();
        // Accessing values
        System.out.println("inherited value1 : " + myObject.inheritValue1);
        System.out.println("inherited value2 : " + myObject.inheritValue2);
        myObject.printInheritValues();
    }
}
