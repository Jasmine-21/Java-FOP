import java.util.*;
public class LargestNumber {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of entries");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    String  st[]=new String[n];
    for(int i=0;i<n;i++)
    {
        st[i]=String.valueOf(arr[i]);
    }
    Arrays.sort(st);
    String max="";
    for(int j=n-1;j>=0;j--)
    {
        max+=st[j];
    }
    System.out.println("max element formed is"+max);
}
}