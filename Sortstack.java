import java.util.*;

public class Sortstack {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    static void sort(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            // Remove the top element from the original stack
            int n = stack.pop();
            // Remove the elements form temp stack which are greater than n and push into original stack
            while (!temp.isEmpty() && temp.peek() > n)
                stack.push(temp.pop());
            temp.push(n);
        }
        System.out.println(temp);
    }
}
