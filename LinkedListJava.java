
//https://www.programiz.com/java-programming/linkedlist
// in java you can use linkedList as stack,queue,deque using its
// built in methods
import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args) {
        // Declaration of LinkedList is simmillar as ArrayList
        LinkedList<Integer> myNumbers = new LinkedList<Integer>();

        // Adding elements
        myNumbers.add(20); // [20]
        myNumbers.add(50); // [20,50]
        // adding element with index
        myNumbers.add(1, 30); // [20, 30, 50]
        // removing element of a index and set a new value there
        myNumbers.set(2, 40);

        System.out.println("Linked List Items : " + myNumbers);
        System.out.println("Second Element : " + myNumbers.get(1));
        // removing element from linked List
        myNumbers.remove(2);
        System.out.println("Linked List Items : " + myNumbers);

        System.out.println("Does Linked list contains 30 ? " + myNumbers.contains(30));
        System.out.println("Position of 30: " + myNumbers.indexOf(30));

        // Looping through linked list
        for (Integer keep : myNumbers) {
            System.out.print(keep + " ");
        }
    }
}
// There are some other methods come with linked list
// 1. addFirst(),addLast(),removeFirst(),removeLast(),getFirst(),getLast()
// 2. peek() returns top element but doesn't remove it
// 3. poll() returns top element and also remove it from linked list
// 4.offer() adds the specified element at the end of the linked list