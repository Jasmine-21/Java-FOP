import java.util.*;
public class deletelasthalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
	}
	 static void deleteFirstHalf(Stack<Integer> stack) {
	        int n = stack.size();
	        Stack<Integer> temp = new Stack<>();
	        while (stack.size() > n / 2)
	            temp.push(stack.pop());
	        while (!stack.isEmpty())
	            stack.pop();
	        while (!temp.isEmpty())
	            stack.push(temp.pop());
	        System.out.println(stack);
	    }
}
