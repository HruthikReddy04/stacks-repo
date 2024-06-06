package Stacks;

public class stackLL {
    class Node {
        int data;
        Node next;

        Node(int value) {
            this.data = value;
            this.next = null;
        }
    }

    Node head;

    public boolean isEmpty() {
        return (this.head == null);
    }

    public int peek() {
        return head.data;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        int value = 0;
        if (!this.isEmpty()) {
            value = head.data;
            head = head.next;
        } else {
            System.out.println("Stack is Empty");
        }
        return value;

    }

    public void display() {
        while (!this.isEmpty()) {
            System.out.println("|  " + this.pop() + "  |");
        }
        System.out.println("________");
    }

    public static void main(String args[]) {
        stackLL s = new stackLL();
        for (int i = 0; i < 5; i++) {
            s.push(i);
        }
        s.display();
        s.head = null;
    }
}
