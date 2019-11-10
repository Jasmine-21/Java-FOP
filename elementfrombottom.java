import java.util.*;
public class elementfrombottom {

	//print the fifth element from the bottom of the stack
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
	}
	 static void printFifthElementFromStart(Stack<Integer> stack) {
	        int n = stack.size();
	        if (n < 5)
	            System.out.println("There are not enough elements in the stack");
	        else {
	            while (stack.size() > 5){
	                stack.pop();
	                 }
	            System.out.println(stack.peek());
	        }
	    }
}
