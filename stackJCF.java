import java.util.*;

public class stackJCF {

    public static void insertBottom(Stack<Integer> s, int value) {
        if (s.size() == 0) {
            s.push(value);
            return;
        }

        int temp = s.pop();

        insertBottom(s, value);

        s.push(temp);
    }

    public static void reverse(Stack<Integer> s) {
        if (s.size() == 0) {
            return;
        }

        int top = s.pop();

        reverse(s);

        insertBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // insertBottom(s, 4);
        reverse(s);
        while (s.size() != 0) {
            System.out.println(s.pop());
        }

    }
}
