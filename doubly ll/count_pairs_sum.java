package github;
import java.util.*;
public class count_pairs_sum {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int j=0;j<n;j++)
		{
		    int t=sc.nextInt();
		int sum=sc.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<t;i++)
		{
		    arr[i]=sc.nextInt();
		}
		getPairsCount(arr,sum);
		}
	}
	public static void getPairsCount(int[] arr,int sum)
	{
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        for(int j=i+1;j<arr.length;j++)
	        {
	            if((arr[i]+arr[j])==sum)
	            {
	                count++;
	            }
	        }
	    }
	        	    System.out.println(count);

	    
	}
}
