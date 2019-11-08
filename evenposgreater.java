//element at even position must be greater than odd position
import java.util.*;
public class evenposgreater {
public static void main(String args[])
{
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=scan.nextInt();
	}
	assign(arr,n);
}
static void assign(int arr[],int n)
{
	Arrays.sort(arr);
	int ans[]=new int[n];
	int m=0,q=n-1;
	for(int i=0;i<n;i++)
	{
	if((i+1)%2==0)
	{
		ans[i]=arr[q--];
	}
	else
	{
		ans[i]=arr[m++];
	}
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(ans[i]+" ");
	}
}
}
