import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        // One Dimensional Array
        int[] numbers = { 1, 4, 5, 3, 2 };
        System.out.println("One Dimensional Array:\n\nElement at index 0: " + numbers[0]);
        System.out.println("Before Sorting: \n" + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After Sorting : \n" + Arrays.toString(numbers));
        System.out.println("Items found at index : " + Arrays.binarySearch(numbers, 2));

        // Two dimensional array
        int[][] data = { { 1, 4, 3 }, { 6, 5, 2 } };
        System.out.println("\nTwo Dimensional Array:\n\nElement at index 0: " + data[0][0]);
        System.out.println("Before Sorting: \n" + Arrays.deepToString(data));
        Arrays.sort(data[0]);
        System.out.println("After Sorting first row: \n" + Arrays.deepToString(data));

    }
}
