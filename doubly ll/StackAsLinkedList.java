
public class StackAsLinkedList {
	// A linked list node 
   Node root;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
boolean isEmpty()
{
	if(root==null)
	{
		return true;
	}
	else
	{
		return false;
	}
	
}
public void push(int data)
{
	Node newNode=new Node(data);
	if(root==null)
	{
		root=newNode;
	}
	else
	{
		Node temp=root;
		root=newNode;
		newNode.next=temp;
	}
	System.out.println(data+" pushed to stack");
}

public int pop()
{
	int popped=Integer.MIN_VALUE;
	if(root==null)
	{
		System.out.println("Stack is empty");
	}
	else
	{
		popped=root.data;
		root=root.next;
	}
	return popped;
}
public int peek()
{
	return root.data;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StackAsLinkedList obj = new StackAsLinkedList(); 
		 obj.push(10);
		 obj.push(20);
		 System.out.println(obj.peek());

		 obj.push(30);
	        // insert Stack value
		 System.out.println(obj.pop());
		 System.out.println(obj.pop());
		 System.out.println(obj.pop());

}
}
