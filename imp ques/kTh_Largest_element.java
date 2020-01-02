package github;
import java.util.*;
import java.util.Collections;
import java.lang.*;
import java.io.*;

public class kTh_Largest_element {
	    public static void kthlargest(Integer arr[],int k)
	    {
	        Arrays.sort(arr,Collections.reverseOrder());
	        for(int i=0;i<k;i++)
	        {
	            System.out.print(arr[i]+" ");
	        }
	        System.out.println();
	    }
		public static void main (String[] args) {
			//code
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
		    int m=sc.nextInt();  
			    int k=sc.nextInt();
	Integer arr[]=new Integer[m];
		    for(int i=0;i<m;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    kthlargest(arr,k);
		}}
	}

