package Stacks;

public class stackClass {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class stack {
        Node head;

        public void push(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;

        }

        public int pop() {
            int value = -1;
            if (!this.isEmpty()) {
                value = head.data;
                head = head.next;
            }
            return value;
        }

        public int peek() {
            if (head != null) {
                return head.data;
            } else {
                // System.out.println("Stack is Empty");
                return -1;
            }

        }

        public boolean isEmpty() {
            return head == null;
        }

        public void display() {
            while (!this.isEmpty()) {
                System.out.println(pop());
            }
        }
    }

    public static void main(String args[]) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        s.display();
    }
}