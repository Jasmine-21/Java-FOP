//at that point where leftmost element equals the rightmost element eg 1 2 3 2 1
import java.util.*;
public class equilibriumpoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
equilibriumpoint equi=new equilibriumpoint();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
System.out.print(equi.equilibrium(arr,n));

	}
	static int equilibrium(int arr[],int n)
	{
		int i,j,left,right;
		for(i=0;i<n;i++)
		{
			left=0;
			for(j=0;j<i;j++)
			{
				left+=arr[j];
			}
			right=0;
			for(j=i+1;j<n;j++)
			{
				right+=arr[j];
			}
			if(left==right)
			return i;
		}
		return -1;
	}

}
