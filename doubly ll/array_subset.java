package github;

public class array_subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3};
		array_sub(arr);

	}
static void array_sub(int arr[])
{
int n=arr.length;
//run loop from 0 to 2 raise to power n

for(int i=0;i<(1<<n);i++)
{
	System.out.print("{ ");
int a=1;
//here a is used to check set bit in binary
for (int j = 0; j < n; j++)
{
	if ((i & a) > 0)
	{		
		System.out.print(arr[j] + " ");
	}
	//count all the subsets present in aray
	a = a << 1;
}

System.out.println("}");
}
}

}

