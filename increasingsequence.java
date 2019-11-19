import java.util.*;

public class increasingsequence {
   static int count = 0;

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int[] arr = new int[n];
       for (int i = 0; i < n; i++)
           arr[i] = s.nextInt();
       int k = s.nextInt();
       numberOfIncresingSubSequences(arr, n, k);
   }

   static void numberOfIncresingSubSequences(int[] arr, int n, int k) {
	   int[] temp = new int[k];
       int len = 0;
              countIncreasingSubsequences(arr, n, k, temp, len);
       System.out.println(count);
   }  static void countIncreasingSubsequences(int[] arr, int n, int k, int[] temp, int len) {
       if (len > 1 && arr[temp[len - 1]] <= arr[temp[len - 2]])
           return;    if (len == k) {
           count++;
           return;
       }    int i;
       if(len==0)
           i=0; else
           i=temp[len-1]+1;
       len++;    while (i < n) {
           temp[len - 1] = i;
           countIncreasingSubsequences(arr, n, k, temp, len);
           i++;
       }
       len--;
   }
}
