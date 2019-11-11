import java.util.*;
public class lasthalfreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
        System.out.println(stack);
	}
	static void reverseSecondHalf(Stack<Integer> stack) {
        int n = stack.size();
        reverse(stack, n / 2);
    }
	 static void reverse(Stack<Integer> stack, int n) {
	        if (n > 0) {
	            int temp = stack.pop();
	            reverse(stack, n - 1);
	            insertAtBottom(stack, temp, n - 1);
	        }
	    }
	 static void insertAtBottom(Stack<Integer> stack, int temp, int n) {
	        if (n == 0)
	            stack.push(temp);
	        else {
	            int temp2 = stack.pop();
	            insertAtBottom(stack, temp, n - 1);
	            stack.push(temp2);
	        }
	    }
}

