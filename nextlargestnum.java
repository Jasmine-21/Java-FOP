import java.util.*;

public class nextlargestnum {
   public static void main(String args[]) {
       String str;
       Scanner s = new Scanner(System.in);
       str = s.nextLine();
       nextLargestNumber(str);
   }
   static void nextLargestNumber(String str) {
       int n = str.length();    StringBuilder s = new StringBuilder(str);
       int i = n - 1;  while (i > 0 && s.charAt(i) <= s.charAt(i - 1))
           i--;
       int j = i - 1;  if (j >= 0) {
           int requiredIndex = i;
           i++;
           while (i < n && s.charAt(i) > s.charAt(j)) {
               if (s.charAt(i) < s.charAt(requiredIndex))
                   requiredIndex = i;
               i++;
           }
           char temp = s.charAt(j);
           s.setCharAt(j, s.charAt(requiredIndex));
           s.setCharAt(requiredIndex, temp);
           System.out.println(s);
       }
       else
           System.out.println("Not Possible");
   }
}
