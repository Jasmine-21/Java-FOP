package graphs;
import java.util.*;

public class graphSetMap {
	//keys=Integer,values,neighbours=HashSet
	HashMap<Integer,HashSet<Integer>> graph=new HashMap<>();
	boolean addVertex(int vertex)
	{
		if(!graph.containsKey(vertex))
		{
			graph.put(vertex, new HashSet<>());
			return true;
		}
		return false;
	}
	void addEdge(int u,int v)
	{
		//purane set ko vapis leke aane ke liye
//		HashSet<Integer> neighbour=graph.get(u); //let's take node 0
//		neighbour.add(v); //at node 0 it is connected with 1.... after [1,2] 
//		graph.put(u, neighbour); //it add the element at node 0. ...print [1,2]
		
		
		graph.get(u).add(v);//write one line instead upper 3line;
		//These 2lines are not applicable bcoz get method check the boolean method and pass a copy
//		graph.set(u).add(v);
//		graph.put(u,graph.get(u).add(v));  //instead of upper 3 line
		
//		neighbour=graph.get(v);
//		neighbour.add(u);
//		graph.put(v,neighbour);
		
		graph.get(v).add(u);
	}
	void print()
	{
		//vertex shi print hogye
		System.out.println(graph.keySet()); //[0,1,2,3,4]
		System.out.println();
		for(Integer key:graph.keySet())
		{
			System.out.println("Adjaency List for Node: "+key); //0..1..2..3..4
			System.out.println(graph.get(key)); //neighbour elements print krega
			
		}
	}
	void BFS(int s)
	{
		System.out.println("----------BFS--------");
		//boolean visited[]=new boolean[v];
		HashSet<Integer> visited=new HashSet<>();
		Queue<Integer> queue=new LinkedList<>();
		visited.add(s);
		queue.add(s);
		while(!queue.isEmpty())
		{
			s=queue.poll();
			System.out.print(s+" ");
			for(Integer n:graph.get(s))
			{
				if(!visited.contains(n))
				{
					visited.add(n);
					queue.add(n);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graphSetMap g=new graphSetMap();
		g.addVertex(0);
		g.addVertex(1);
		g.addVertex(2);
		g.addVertex(3);
		g.addVertex(4);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		//no error ,only copy of this element is store
//		g.addEdge(0, 3);
		g.addEdge(1,3);
		g.addEdge(2,4);
		g.addEdge(3,4);
		
		
		g.print();
		
		
		g.BFS(3);
		
		
	}

}

