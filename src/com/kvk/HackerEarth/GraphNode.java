package com.kvk.HackerEarth;

import java.util.HashSet;
import java.util.Set;


public class GraphNode {
	long data;
	Set<GraphNode> next,prev;
	public GraphNode(){
		
	}
	public GraphNode(long d){
		this.data=d;
		this.next=new HashSet<GraphNode>();
		this.prev=new HashSet<GraphNode>();
	}
}
