import java.util.*;
public class head5th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<Integer> queue=new LinkedList<Integer>();
Scanner s=new Scanner(System.in);
int n=s.nextInt();
while(n-->0)
{
	queue.add(s.nextInt());
}
printFifthElementFromStart(queue);

	}
    static void printFifthElementFromStart(Queue<Integer> queue) {
    if(queue.size()<5)
    {
        System.out.println("There are no enough elements in the queue");

    }
    else
    {
    	for (int i = 0; i < 4; i++)
            queue.remove();
        System.out.println(queue.peek());
    }
    }

}
