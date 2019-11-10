import java.util.*;
public class stackreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stack<Character> s = new Stack<Character>();
	        Scanner in = new Scanner(System.in);
	        String ans = "", data = in.nextLine();
	        for (char element : data.toCharArray()) {
	            s.push(element);
	        }
	        for (char element : data.toCharArray()) {
	            ans += s.pop();
	        }
	        System.out.print(ans);
	}

}
