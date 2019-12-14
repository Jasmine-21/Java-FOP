package github;

import java.util.*;

public class withoutUsingArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a, b ;
//		   Scanner in = new Scanner(System.in);	
//		   System.out.print("Enter a: ");
//		   a = in.nextInt(); 
//		   System.out.print("Enter b: ");
//		   b = in.nextInt(); 
//	      while(b != 0){
//	           int  c = a & b;
//	           // System.out.print(c);
//	            a = a ^ b;
//	            b = c << 1;
//	        }
//	        System.out.print("Sum: "+a);
//	        System.out.print("Sum: "+b);
		 Scanner sc=new Scanner(System.in);
	        int num1=sc.nextInt();
	        int num2=sc.nextInt();
	        while(num1!=0)
	        {
	            num2++;
	            num1--;
	        }
	        System.out.println("result="+num2);
	        
	}
}
