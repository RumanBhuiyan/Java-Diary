import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Byte input
            System.out.print("byte: ");
            byte myByte = scanner.nextByte();
            System.out.println("Your byte : " + myByte);
            // Int input
            System.out.print("int: ");
            int myInt = scanner.nextInt();
            System.out.println("Your int : " + myInt);
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
