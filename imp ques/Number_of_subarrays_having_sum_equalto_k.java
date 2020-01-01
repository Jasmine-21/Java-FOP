package github;
import java.util.*;
public class Number_of_subarrays_having_sum_equalto_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 10, 2, -2, -20, 10 };  
	        int sum = -10;  
	        int n = arr.length; 
	        System.out.println(findSubarraySum(arr, sum)); 

	}
	
	 public static  int findSubarraySum(int[] arr, int k) {
	       
		 /*
			 * Time complexity : O(n^3)

		Space complexity : O(1).
			 
		 int count = 0;
	        for (int start = 0; start < arr.length; start++) {
	            for (int end = start + 1; end <= arr.length; end++) {
	                int sum = 0;
	                for (int i = start; i < end; i++)
	                    sum += arr[i];
	                if (sum == k)
	                    count++;
	            }
	        }
	        return count;
	        
	     */
		 
		 
		 
		/* 
		 Time complexity : O(n^2)

				 Space complexity : O(1)
		 int count = 0;
	        for (int start = 0; start < arr.length; start++) 
	        {
	            int sum=0;
	            for (int end = start; end < arr.length; end++) 
	            {
	                sum+=arr[end];
	                if (sum == k)
	                    count++;
	            }
	        }
	        return count;*/
		 
		 
		 /*Time complexity-O(n)
		  * Space complexity-O(n)
		  * 
		  * 
		  * */
		 int count = 0, sum = 0;
	        HashMap < Integer, Integer > map = new HashMap < > ();
	        map.put(0, 1);
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	            if (map.containsKey(sum - k))
	                count += map.get(sum - k);
	            map.put(sum, map.getOrDefault(sum, 0) + 1);
	        }
	        return count;
		  
	    }

}

