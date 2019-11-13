import java.util.*;
public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
	}

	 static void sort(Queue<Integer> queue) {
	        Queue<Integer> temp = new LinkedList<Integer>();
	        temp.add(queue.remove());
	        while (!queue.isEmpty()) {
	            // Remove the first element from the queue
	            int n = queue.remove();
	            int size = temp.size();
	            boolean flag = true;
	            // Remove the elements from the temp queue which are less than n and add them back to the same queue
	            // then add n to the temp queue and then the remaining elements which are greater than n
	            for (int i = 0; i < size; i++) {
	                if (flag) {
	                    if (!temp.isEmpty() && temp.peek() < n)
	                        temp.add(temp.remove());
	                    else {
	                        temp.add(n);
	                        temp.add(temp.remove());
	                        flag = false;
	                    }
	                } else
	                    temp.add(temp.remove());
	            }
	            // If all the elements in the temp queue are less than n, add n at the end of the queue
	            if (flag)
	                temp.add(n);
	        }
	        System.out.println(temp);
	    }
}
