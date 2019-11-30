
public class basics {

	int arr[]=new int[10];
	int size=0;
	public int getParentIndex(int i)
	{
		return (i-1)/2;
	}
	public int getLeftChildIndex(int i)
	{
		return (2*i+1);
	}
	public int getRightChildIndex(int i)
	{
		return (2*i+2);
	}
	public boolean hasParent(int i)
	{
		//	if(getParentIndex(i)>=0)
		//	{
		//		return true; //means value must stored at pos 0 or greater than 0
		//	}
		//	return false; 
		return getParentIndex(i)>=0;
	}
	public boolean hasLeftChild(int i)
	{
		//	if(getLeftChildIndex(i)<size)
		//	{
		//		return true;
		//	}
		//	return false;
		return getLeftChildIndex(i)<size;
	}
	public boolean hasRightChild(int i)
	{
		return getRightChildIndex(i)<size;
	}
	public int parent(int i)
	{
		return arr[getParentIndex(i)];
	}
	public int leftChild(int i)
	{
		return arr[getLeftChildIndex(i)];
	}
	public int rightChild(int i)
	{
		return arr[getRightChildIndex(i)];
	}
	int size()
	{
		return size;
	}
	boolean isEmpty()
	{
		return size<=0; //or size==0
	}
	int peek()
	{
		//	return arr[size-1];  //last element dega humko
		return arr[0]; //priority root ki hoti hmesha
	}
	void  insert(int val)
	{
		arr[size]=val;
		size++;
		HeapifyUp();
	}
	void HeapifyUp()
	{
		int i=size-1;
		//check parent exist and check the value of parent key with current value
		while(hasParent(i)&&parent(i)<arr[i])
		{
			swap(i,getParentIndex(i));
			i=getParentIndex(i);

		}
	}
	void swap(int a,int b) 
	{
		int temp=arr[a];//index pass karenge
		arr[a]=arr[b];
		arr[b]=temp;
	}
	void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	int poll()
	{
		int value=arr[0];//store root element
		arr[0]=arr[size-1];
		size--;
		HeapifyDown();
		return value;
	}
	void HeapifyDown()
	{
		int i=0;
		//check leftChildindex exist
		while(hasLeftChild(i))
		{
			//assume that left child is greater than right child
			int greaterChildIndex=getLeftChildIndex(i);
			if(hasRightChild(i)&&rightChild(i)>leftChild(i))
			{
				greaterChildIndex=getRightChildIndex(i);
			}
			//now swap the index of the parent node with his children
			if(arr[i]<arr[greaterChildIndex])
			{
				swap(i,greaterChildIndex);

			}
			else
			{
				break;
			}
			i=greaterChildIndex;

		}
	}
	void sort()
	{
		while(size!=0)
		{
			int temp=arr[0];
			arr[0]=arr[size-1];
			arr[size-1]=temp;
			size--;
			HeapifyDown();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basics mh=new basics();
		mh.insert(10);
		mh.insert(5);
		mh.insert(3);
		mh.insert(2);
		mh.insert(7);
		System.out.println("Insertion");
		mh.print();
		
		mh.poll();
		System.out.println("Delete");
		mh.print();
		System.out.println("Sort");

		mh.sort();
		mh.print();

			}

}
