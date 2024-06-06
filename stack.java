package Stacks;

public class stack {
    int MAX = 100;
    int a[] = new int[MAX];
    int top;

    stack() {
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public boolean isFull() {
        return (top == MAX - 1);
    }

    public void push(int value) {
        if (!isFull()) {
            top = top + 1;
            a[top] = value;

        } else {
            System.out.println("Stack is Full");
        }
    }

    public int pop() {
        int value = -1;
        if (!isEmpty()) {
            value = a[top];
            top = top - 1;
        } else {
            System.out.println("Stack is Empty");
        }

        return value;
    }

    public int peek() {
        if (!isEmpty()) {
            return a[top];
        }
        return -1;
    }

    public void display() {

        // // base case
        // if (isEmpty()) {
        // return;
        // }
        // int x = pop();

        // display();

        // System.out.println("| " + x + " |");

        // push(x);

        StringBuilder result = new StringBuilder();
        while (!this.isEmpty()) {
            result.append(this.pop() + " ");
        }

        System.out.println(result.toString());
    }

    public static void main(String args[]) {
        stack s = new stack();
        for (int i = 0; i < 10; i++) {
            s.push(i);
        }
        s.display();
        System.out.println(s.isEmpty());

    }
}