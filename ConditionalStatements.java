public class ConditionalStatements {
    public static void main(String[] args) {
        // Ternary Operator
        int num = 5;
        System.out.println(num > 0 ? "positive" : "negative");

        // if else statement
        if (num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }

        // if-elseif-else ladder
        if (num == 0) {
            System.out.println("Number is 0");
        } else if (num > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

        // switch statement
        int tracker = num == 0 ? 0 : num > 0 ? 1 : -1;
        switch (tracker) {
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is positive");
                break;
            default:
                System.out.println("Number is negative");
        }
    }
}
