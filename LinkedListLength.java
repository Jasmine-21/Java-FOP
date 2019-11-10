//import DeleteEnd.Node;

public class LinkedListLength
{
	class Node
	{
	Node next;	
	int data;
	 public Node(int data) {  
         this.data = data;  
         this.next = null;  
     }  
	}
	public Node head=null;
	public Node tail=null;
	public void addAtStart(int data) {  
	        Node newNode = new Node(data);  
	          if(head == null) {  
	            head = newNode;  
	            tail = newNode;  
	        }  
	        else {  
	            Node temp = head;  
	            head = newNode;  
	            head.next = temp;  
	    }  

	}
	
public int getCount()
{
	Node temp=head;
	int count=0;
	while(temp!=null)
	{
		count++;
		temp=temp.next;
	}
	return count;
}
	
		// TODO Auto-generated method stub

public static void main(String[] args) {  
    
    LinkedListLength sList = new LinkedListLength();  
sList.addAtStart(1);  
   // sList.getCount();  

    sList.addAtStart(2);  
    sList.addAtStart(22);  
    sList.addAtStart(24);
    System.out.println("Count "+sList.getCount() );  
}  

}
