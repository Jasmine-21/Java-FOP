import java.util.*;
public class elementfromtop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
while(n-->0)

	st.push(sc.nextInt());
printFifthElementFromEnd(st);
	}
	static void printFifthElementFromEnd(Stack<Integer> st)
	{
		int n=st.size();
		if(n<5)
		{
            System.out.println("There are not enough elements in the stack");

		}
		else
		{
			for(int i=0;i<4;i++)
			{
				st.pop();
			}
			System.out.println(st.peek());
		}
	}
}
