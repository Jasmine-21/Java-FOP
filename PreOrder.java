import java.util.*;
class PreOrder 
{ 
    Node root; 
  
    PreOrder() 
    { 
        root = null; 
    } 
   
    void printPreorder(Node node) 
    { 
    	if (node == null) 
            return; 
        System.out.print(node.key + " "); 
        printPreorder(node.left); 
        printPreorder(node.right); 
    } 
    
    void printPreorder()    {     printPreorder(root);   } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        PreOrder tree = new PreOrder(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        
  
        System.out.println("\nPreorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        
    }
}
