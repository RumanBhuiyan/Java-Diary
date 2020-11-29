public class InheritanceObjectClass {
    protected int inheritValue1 = 5;
    public int inheritValue2 = 10;

    public void printInheritValues() {
        System.out.println("value1 : " + inheritValue1 + " value2 : " + inheritValue2);
    }

    InheritanceObjectClass() {
        System.out.println("Constructor is called !!");
    }
}
// N.B:
// 1. for inheriting extends keyword is used
// 2.if this class becomes final class then it can't be inherited
// 3. besides inheriting , its object can be created also
