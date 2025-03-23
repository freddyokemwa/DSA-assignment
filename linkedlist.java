// Node class representing each element in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// SinglyLinkedList class with methods to insert and delete nodes
class SinglyLinkedList {
    Node head; // Head of the linked list

    // Constructor to initialize an empty linked list
    public SinglyLinkedList() {
        this.head = null;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to delete a node from the beginning of the linked list
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
        } else {
            head = head.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insert nodes at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        System.out.println("Linked List after inserting at the beginning:");
        list.printList();

        // Insert nodes at the end
        list.insertAtEnd(40);
        list.insertAtEnd(50);

        System.out.println("Linked List after inserting at the end:");
        list.printList();

        // Delete a node from the beginning
        list.deleteFromBeginning();

        System.out.println("Linked List after deleting from the beginning:");
        list.printList();
    }
}
