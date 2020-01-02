package github;
import java.io.*;
import java.util.*;


class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
public class delete_node_from_BinaryTree {
    public static void inorder(Node root){
        if(root == null)
            return;
            inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    HashMap<Integer, Node> map = new HashMap<>();
		  int n = sc.nextInt();
            Node root = null;
            Node parent;
            int p;
		    while(n-- > 0){
		        p = sc.nextInt();
		        
		        if(!map.containsKey(p)){
		            root = new Node(p);
		            map.put(root.data, root);
		        }
		        parent = map.get(p);
		        
		        int ch = sc.nextInt();
		        Node child = new Node(ch);
		        
		        char c = sc.next().charAt(0);
		        if(c == 'L')
		            parent.left = child;
		        else if(c == 'R')
		            parent.right = child;
		            
		        map.put(ch, child);
		    }
		    
		    int key = sc.nextInt();
		   
		    deleteNode obj = new deleteNode();
		    root = obj.deletionBT(root, key);
		    
		    inorder(root);
		    System.out.println();
		}
	}
	
	public static void display(Object o){
	    System.out.println(o);
	}
}



class deleteNode {
    
    public Node deletionBT(Node root, int key){

    	if (root == null)
        {
            return root;
        }
        Queue<Node> tree = new LinkedList<Node>();
        tree.add(root);
        
        Node d = null, last = null, parent = null;
        Queue<Node> temp = tree;
        while (!temp.isEmpty())
        {
            Node e = temp.poll();
            
            if (e.left != null)
            {
                parent = e;
                temp.add(e.left);
                last = e.left;
                if (e.left.data == key)
                {
                    d = e.left;
                }
            }
            if (e.right != null)
            {
                parent = e;
                temp.add(e.right);
                last = e.right;
                if (e.right.data == key)
                {
                    d = e.right;
                }
            }
        }
        
        if (d != null)
        {
            d.data = last.data;
            if (parent.left == last)
            {
                parent.left = null;
            }
            else
            {
                parent.right = null;
            }
        }
        
        return root;
    }
}