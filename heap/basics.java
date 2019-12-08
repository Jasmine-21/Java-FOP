package graphs;
import java.util.*;
class graph

{
	int v;   //number of nodes
//	LinkedList<Integer> ll=new LinkedList<>(); //we make object but actual we have to make array
	LinkedList<Integer> adjListArray[];
	graph(int v)
	{	
	 this.v=v;
	 adjListArray=new LinkedList [v];
	for(int i=0;i<v;i++)
	{
		adjListArray[i]=new LinkedList<>();
	}
	}
	void addEdge(int u,int v)
	{
		adjListArray[u].add(v); //at each index add node
		adjListArray[v].add(u); // because of Undirectional graph
	}
	void print()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("Adjancy List of vertex: "+i);
			for(Integer n:adjListArray[i])
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
	}
	void BFS(int s)
	{
		System.out.println("----------BFS--------");
		boolean visited[]=new boolean[v];
		Queue<Integer> queue=new LinkedList<>();
		queue.add(s);
		visited[s]=true;
		while(!queue.isEmpty())
		{
			s=queue.poll();
			System.out.println(s+"  ");
			for(Integer n:adjListArray[s])
			{
				if(!visited[n])
				{
					queue.add(n);
					visited[n]=true;
				}
			}
		}
		System.out.println();
	}
}

public class basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		graph g=new graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(3, 4);
		g.addEdge(4, 2);
		g.print();
		g.BFS(2);
	}

}
