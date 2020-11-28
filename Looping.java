public class Looping {
    public static void main(String[] args) {
        // for loop
        System.out.println("For loop: ");
        for (int i = 0; i < 5; i++)
            System.out.println("i: " + i);

        // while loop
        System.out.println("While loop: ");
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        // do-while loop
        System.out.println("do-while loop :");
        int k = 0;
        do {
            System.out.println("k : " + k);
            k++;
        } while (k < 5);

        // For-each loop
        System.out.println("For Each loop");
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int keep : numbers) {
            System.out.println("keep : " + keep);
        }

    }
}
