package graphs;
import java.util.*;
public class setimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<>();
		set.add(6);
		set.add(4);
		//error nhi dikhaega bs uski copy store krlega
		set.add(3);
		set.add(3);
		set.add(9);
		//insertion order maintain nhi rhta
		for(Integer n:set)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(set.contains(3));
		System.out.println(set.contains(5));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		set.clear();
		System.out.println(set.isEmpty());
		System.out.println(set.size());


	}

}
