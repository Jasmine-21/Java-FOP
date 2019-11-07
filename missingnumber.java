import java.util.Scanner;

public class missingnumber {
	public static void main(String args[])
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		//this method is only for to find single misssing element from array
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);
		int sum1=0;
		for(int j=1;j<=arr.length;j++)
		{
			sum1+=j;
		}
		System.out.println(sum1);
		System.out.println("missing number "+(sum-sum1));
		*/
		
		int[] input = { 1, 1, 2, 3, 5, 5 ,5};  
	     int[] register = new int[input.length]; 
	     for (int i : input) { register[i] = 1; } 
	     // now, let's print all the absentees 
	     System.out.println("missing numbers in given array");
	     for (int i = 1; i < register.length; i++) 
	     { 
	    	 if (register[i] == 0) 
	    	 { 
	    		 System.out.println(i); 
	         } 
	         
	     } 
	}
}
