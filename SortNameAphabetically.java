import java.util.Scanner;

public class SortNameAphabetically {
	public static void main(String args[])
	{
		String arr[]=new String[5];
		Scanner sc=new Scanner(System.in);
		String min=null;
		int loc=0;
		System.out.println("Enter 5 values");
		for(int i=0;i<=4;i++)
		{
			arr[i]=sc.nextLine();
		}
	//use compareTo method in string which return value in form of integers.
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			loc=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j].compareTo(min)<0)
				{
					min=arr[j];
					loc=j;
				}
			}
			if(loc!=i)
			{
				String temp=arr[loc];
				arr[loc]=arr[i];
				arr[i]=temp;
			}
		}
		for(int i=0;i<=4;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
