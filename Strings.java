//Some prebuilt methods of string type in java
public class Strings {
    public static void main(String[] args) {
        String name = "Ruman Bhuiyan";

        System.out.println("Is String empty : " + name.isEmpty());
        System.out.println("String Length: " + name.length());
        System.out.println("Index of a character: " + name.indexOf('R'));
        System.out.println("Lower Case: " + name.toLowerCase());
        System.out.println("Upper Case : " + name.toUpperCase());
        System.out.println("Removing extra spaces : " + name.trim());
        System.out.println("Replacing a character: " + name.replace('R', 'B'));

    }
}
