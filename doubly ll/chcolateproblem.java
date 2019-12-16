package github;

import java.util.*;
public class chcolateproblem {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of packets of chocolates");
        int packets=sc.nextInt();
        System.out.println("enter the no. of chocolates in packets");
        int arr[]=new int[packets];
        for(int i=0;i<packets;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. of students");
        int students=sc.nextInt();
        Arrays.sort(arr);
        int mindiff=arr[students-1]-arr[0];
        System.out.println("min difference is"+mindiff);
    }
}
