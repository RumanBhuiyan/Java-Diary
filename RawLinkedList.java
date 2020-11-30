public class RawLinkedList {
    // pointer of first node or pointer of previous node
    Node head;

    static class Node {
        int value;
        // pointer of next node
        Node next;

        Node(int keep) {
            // assigning value to a node
            value = keep;
        };
    }

    // my own function to add items in linked list
    public void add(RawLinkedList ll, int newNodeValue) {
        Node newNode = new Node(newNodeValue);
        RawLinkedList.Node i = ll.head;
        while (i.next != null) {
            i = i.next;
        }
        i.next = newNode;
    }

    public static void main(String[] args) {
        RawLinkedList myll = new RawLinkedList();

        // creating seperate nodes by calling constructors
        myll.head = new Node(2);// head.next, head.value
        Node second = new Node(3);// second.value,second.next
        Node third = new Node(4);// third.value, third.next

        // Connecting Nodes
        myll.head.next = second;// next and second both are Node type
        second.next = third;

        // Accessing Values
        System.out.print("Linked List Elements: ");
        for (RawLinkedList.Node i = myll.head; i != null; i = i.next) {
            System.out.print(i.value + " ");
        }

        // Adding new item
        System.out.print("\nAfter adding new Item : ");
        myll.add(myll, 5);
        myll.add(myll, 6);
        myll.add(myll, 7);
        myll.add(myll, 8);
        for (RawLinkedList.Node i = myll.head; i != null; i = i.next) {
            System.out.print(i.value + " ");
        }
    }
}