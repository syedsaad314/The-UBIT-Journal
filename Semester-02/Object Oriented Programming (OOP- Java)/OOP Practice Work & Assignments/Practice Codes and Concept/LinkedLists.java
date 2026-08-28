import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
class LinkedList {
    Node head;

    // Insert a new node at the end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) { // list empty
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) { // move to last node
            temp = temp.next;
        }
        temp.next = newNode; // attach at end
    }

    // Insert at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // link new node to previous head
        head = newNode; // update head
    }

    // Delete a node by value
    void delete(int key) {
        Node temp = head, prev = null;

        // Case 1: head node holds the key
        if (temp != null && temp.data == key) {
            head = temp.next; // move head
            return;
        }

        // Case 2: search for the key
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // If not found
        if (temp == null) {
            System.out.println("Node not found!");
            return;
        }

        prev.next = temp.next; // unlink the node
    }

    // Search for a value
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    // Display all nodes
    void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Main class
public class LinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter data for node " + (i + 1) + ": ");
            int data = sc.nextInt();
            list.insert(data); // user-driven insertion
        }

        System.out.println("\nYour Linked List:");
        list.display();

        System.out.print("\nEnter value to search: ");
        int key = sc.nextInt();
        System.out.println(list.search(key) ? "Node found!" : "Node not found!");

        System.out.print("\nEnter value to delete: ");
        int del = sc.nextInt();
        list.delete(del);

        System.out.println("\nList after deletion:");
        list.display();
        
        sc.close();             
    }
        
}
