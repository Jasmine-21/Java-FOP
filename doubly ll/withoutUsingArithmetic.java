//package github;

import java.util.*;

public class withoutUsingArithmetic {

	public static void main(String[] args) {
		int a, b ;
		   Scanner sc = new Scanner(System.in);	
		   System.out.println("Enter a: ");
		   a = sc.nextInt(); 
		   System.out.println("Enter b: ");
		   b = sc.nextInt(); 
	      while(b != 0){
	            int c = a & b;
	            a = a ^ b;
	            b = c << 1;
	        }
	        System.out.println("Sum: "+a); 
	}
}
