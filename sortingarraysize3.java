import java.util.Scanner;

public class sortingarraysize3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		if(n%3==0)
		{
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-3;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		}
		else
		{
			System.out.print("Message undisplay");
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
}
}
