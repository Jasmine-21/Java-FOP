import java.util.*;
public class nonzerofact {
	
	   public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       System.out.print(lastNonZeroDigit(n));
	   }

	   // Method to find the last digit of n!
	   static int lastNonZeroDigit(int n) {
	       // initialise factorial value to 1
	       int factorial = 1;
	       // for loop to calculate the value of factorial
	       // you need not iterate the for loop for i=0 or 1 because if n=0 or 1 the factorial value is 1 and factorial
	       // is already initialized to 1
	       for (int i = 2; i <= n; i++)
	           factorial *= i;
	       // while loop to find the last non-zero digit of the factorial value
	       while (factorial % 10 == 0)
	           factorial /= 10;
	       return factorial % 10;
	   }
	}


