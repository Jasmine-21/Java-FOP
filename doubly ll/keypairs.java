package github;

import java.util.*; 
//keypair-two elements in whose sum is equal to x
class Keypairs {     
	static boolean hasArrayTwoCandidates(int A[], int arr_size, int sum) 
    { 
        int l, r; 
        Arrays.sort(A);
        l = 0; 
        r = arr_size - 1; 
        while (l < r) 
        { 
            if (A[l] + A[r] == sum) 
                return true;
            else if (A[l] + A[r] < sum) 
                l++; 
            else 
                r--; 
        } 
                return false;
    } 
  
    public static void main(String args[]) 
    { 
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       int n=sc.nextInt();

       int A[]=new int[t];
       for(int i=0;i<t;i++)
       {
    	   A[i]=sc.nextInt();
       }
        int arr_size = A.length;
        // hasArrayTwoCandidates(A, arr_size, n);
        if(hasArrayTwoCandidates(A, arr_size, n)==true)
        System.out.println("Yes");
        else
        System.out.println("No");
           
    } 
}
