import java.util.*;
public class alternateposndneg {
	 void rightrotate(int arr[], int n, int outofplace, int cur)  
	    { 
	        int tmp = arr[cur]; 
	        for (int i = cur; i > outofplace; i--) 
	            arr[i] = arr[i - 1]; 
	        arr[outofplace] = tmp; 
	    } 
	 void rearrange(int arr[], int n)  
	    { 
	        int outofplace = -1; 
	  
	        for (int index = 0; index < n; index++)  
	        { 
	            if (outofplace >= 0)  
	            { 
	            	 if (((arr[index] >= 0) && (arr[outofplace] < 0)) 
	                         || ((arr[index] < 0) && (arr[outofplace] >= 0)))  
	                 { 
	                     rightrotate(arr, n, outofplace, index); 
	   
	                     // the new out-of-place entry is now 2 steps ahead 
	                     if (index - outofplace > 2)  
	                         outofplace = outofplace + 2; 
	                     else
	                         outofplace = -1; 
	                 } 
	             } 
	   
	             // if no entry has been flagged out-of-place 
	             if (outofplace == -1)  
	             { 
	                 // check if current entry is out-of-place 
	                 if (((arr[index] >= 0) && ((index & 0x01)==0)) 
	                         || ((arr[index] < 0) && (index & 0x01)==1)) 
	                     outofplace = index; 
	             } 
	         } 
	     } 
	 void printArray(int arr[], int n)  
	    { 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(""); 
	    } 
	            
	public static void main(String[] args) {
		alternateposndneg rearrange = new alternateposndneg();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Given array is "); 
rearrange.printArray(arr, n); 

rearrange.rearrange(arr, n); 

System.out.println("RearrangeD array is "); 
rearrange.printArray(arr, n); 
	}
	

}
