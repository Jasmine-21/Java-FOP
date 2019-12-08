package graphs;

import java.util.*;

public class mapimp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(0,"Jazz");
		map.put(1,"Deepali");
		map.put(2, "Johar");
		map.put(3,"Ayushi");
		map.put(4,"Mallika");
		System.out.println(map.get(3));
		System.out.println(map.containsKey(0));
		map.put(3,"Ayu");
		System.out.println(map.get(3));
		
	}

}
