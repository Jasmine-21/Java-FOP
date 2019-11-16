

import java.util.*;
public class subArray
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //int sum[]=new int[n*n];
        int k=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }



        int s;
        n=n-k+1;
        s=(n*(n+2))/2;
        System.out.println(s);
       

    }




}

