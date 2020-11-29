import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args) {
        // ArrayList<String> myNumbers = new ArrayList<String>();
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        // adding items in the list
        myNumbers.add(5);
        myNumbers.add(2);
        myNumbers.add(4);
        myNumbers.set(0, 7);
        // myNumbers.remove(0);
        // Before sorting accessing numbers
        System.out.print("Before sorting :");
        for (int i = 0; i < myNumbers.size(); i++) {
            System.out.print(myNumbers.get(i) + " ");
        }
        // sorting the list
        Collections.sort(myNumbers);
        System.out.print("\nAfter sorting :");
        for (Integer keep : myNumbers) {
            System.out.print(keep + " ");
        }
    }
}
