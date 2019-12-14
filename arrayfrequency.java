package github;
import java.util.*;
public class arrayfrequency {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n =sc.nextInt();
        int arr[]=new int[n];
        int dup[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            dup[i]=-1;
        }
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    //eg 1 2 1 array hai toh vo ek baar 1 ko 2 baar count krega,2 ko 1 baar,aur 1 v dubara1 count krega....
                    //aisa naa krne ke liye we write next statement
                    dup[j]=0;
                }
            }
            //ek Element array mein kitni baar aarha.
            if(dup[i]!=0)
            {
                dup[i]=count;
            }
        }
        System.out.println("frequency of each elelemnt is");
        
           for(int i=0;i<n;i++)
           {
               if(dup[i]!=0)
               {
                   System.out.println(arr[i]+"comes"+dup[i]+"times");
               }
           }
        
       
    }
}
