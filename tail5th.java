import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class tail5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue=new LinkedList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n-->0)
		{
			queue.add(s.nextInt());
		}
		printFifthElementFromEnd(queue);
	}
    static void printFifthElementFromEnd(Queue<Integer> queue) {
    	 int n = queue.size();
         if (n < 5)
             System.out.println("There are no enough elements in the queue");
         else {
             while (queue.size() > 5)
                 queue.remove();
             System.out.println(queue.peek());
         }
    }
}
