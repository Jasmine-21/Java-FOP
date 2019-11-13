import java.util.*;
public class deletesecondhalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<Integer> queue = new LinkedList<Integer>();
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        while (n-- > 0)
	            queue.add(s.nextInt());
	        deleteSecondHalf(queue);
	}
	static void deleteSecondHalf(Queue<Integer> queue) {
        int n = queue.size();
        int temp = n - n / 2;
        for (int i = 0; i < temp; i++)
            queue.add(queue.remove());
        for (int i = 0; i < n / 2; i++)
            queue.remove();
        System.out.println(queue);
    }
}
