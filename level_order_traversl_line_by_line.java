package github;
import java.util.LinkedList; 
import java.util.Queue; 
  
public class level_order_traversl_line_by_line {
	//level order traversal line by line
	/*using one queue*/
	  static class Node { 
	    int data; 
	    Node left; 
	    Node right; 
	  
	    Node(int data) { 
	      this.data = data; 
	      left = null; 
	      right = null; 
	    } 
	  }  
	  static void levelOrder(Node root) { 
	    if (root == null) 
	      return; 
	  
	    Queue<Node> q = new LinkedList<>();
	    q.add(root); 
	    q.add(null); 	  
	    while (!q.isEmpty()) { 
	   Node curr = q.poll();  
	      if (curr == null) { 
	        if (!q.isEmpty()) { 
	          q.add(null); 
	          System.out.print("$ "); 
	        } 
	      } else { 
	        if (curr.left != null) 
	          q.add(curr.left); 
	  
	        if (curr.right != null) 
	          q.add(curr.right); 
	  
	        System.out.print(curr.data + " "); 
	      } 
	    }
        System.out.print("$ "); 

	  } 
	  /* using two queue
	   * 
	   * static void levelOrder(Node root) 
    { 
        Queue<Node> q1 = new LinkedList<Node>(); 
        Queue<Node> q2 = new LinkedList<Node>(); 
  
        if (root == null) 
            return; 
          q1.add(root); 
          while (!q1.isEmpty() || !q2.isEmpty()) 
        { 
            while (!q1.isEmpty()) 
            { 
                if (q1.peek().left != null) 
                    q2.add(q1.peek().left); 
                  if (q1.peek().right != null) 
                    q2.add(q1.peek().right); 
  
                System.out.print(q1.peek().data + " "); 
                q1.remove(); 
            } 
            System.out.println(); 
  
            while (!q2.isEmpty()) 
            { 
  
                if (q2.peek().left != null) 
                    q1.add(q2.peek().left); 
  
               
                if (q2.peek().right != null) 
                    q1.add(q2.peek().right); 
  
                System.out.print(q2.peek().data + " "); 
                q2.remove(); 
            } 
            System.out.println(); 
        } 
        */
	  
	  // Driver function 
	  public static void main(String[] args) { 
	  
	    Node root = new Node(1); 
	    root.left = new Node(2); 
	    root.right = new Node(3); 
	    root.left.left = new Node(4); 
	    root.left.right = new Node(5); 
	    root.right.right = new Node(6); 
	  
	    levelOrder(root); 
	  } 
	} 

