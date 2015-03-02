package com.kvk.HackerEarth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.kvk.HackerEarth.GraphNode;
public class MedlifeOliveAndGame {

	public static boolean findNode(GraphNode g,String direction,GraphNode key){
		boolean flag=false;	
		if(direction.equalsIgnoreCase("prev")){
				Set<GraphNode> gnset=g.prev;
				for (GraphNode graphNode : gnset) {
					if(graphNode.prev.contains(key))
						flag=true;
					else
						flag=findNode(graphNode, direction, key);
				}
			}else{
				Set<GraphNode> gnset=g.next;
				for (GraphNode graphNode : gnset) {
					if(graphNode.next.contains(key))
						flag=true;
					else
						flag=findNode(graphNode, direction, key);
				}
			
			}
		return flag;
		}
	
	public static void main(String[] args) {
		Map<Long, GraphNode> nodeLookup=new HashMap<Long, GraphNode>();
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long i=1;
		GraphNode temp;
		while(i<=N){
			temp=new GraphNode(i);
			nodeLookup.put(i, temp);
		}
		
		i=1;
		GraphNode A,B;
		while(i<N){
			A=nodeLookup.get(sc.nextLong());
			B=nodeLookup.get(sc.nextLong());
			A.next.add(B);
			B.prev.add(A);
		}
		long Q=sc.nextLong();
		long z,X,Y;
		Set<GraphNode> tempNodes;
		while((Q--)>0){
			z=sc.nextLong();
			X=sc.nextLong();
			Y=sc.nextLong();
			if(z==0){
				if(findNode(nodeLookup.get(Y), "prev", nodeLookup.get(X)))
					System.out.println("YES");
				else
					 System.out.println("NO");
			}else{
				if(findNode(nodeLookup.get(Y), "next", nodeLookup.get(X)))
					System.out.println("YES");
				else
					 System.out.println("NO");
			}
		}
	}
	

}
