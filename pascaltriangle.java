import java.util.*;

public class pascaltriangle {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       printPascalTriangle(n);
   }

   
   private static void printPascalTriangle(int n) {
       int c = 0;
       StringBuilder str;
       for (int i = 1; i <= n; i++) {
           str = new StringBuilder();
           for (int j = 1; j <= n - i; j++)
               str.append(" ");
           for (int j = 1; j <= i; j++) {
               if (j == 1 || j == i)
                   c = 1;
               else {
                   c *= i - (j - 1);
                   c /= j - 1;
               }
               str.append(c + " ");
           }
           System.out.println(str);
       }
   }
}
