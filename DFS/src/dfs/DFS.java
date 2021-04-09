/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Yuliana Dewi
 */
public class DFS {
     int V;    
    LinkedList<Integer> adjList[]; 
    
    
    DFS(int v) {
        System.out.println("Visit by using DFS algorithm :");
        V = v;
        adjList = new LinkedList[v];
        for (int i=0; i<v; ++i)
		{
            adjList[i] = new LinkedList();  
		}
    }
   
    void addEdgesToGraph(int v, int u)
    {
        adjList[v].add(u);     
    }
	
    void DFTraversal(int v,int visited[])
    {
        visited[v] = 1;
            System.out.print(v + " ");
        Iterator<Integer> i = adjList[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (visited[n]==0)
                DFTraversal(n, visited);
        }
    }
	
    void DFSearch(int v)
    {
        
        int visited[] = new int[V];
		
        DFTraversal(v, visited);
		for (int i=1;i<V;i++)
		{
			if(visited[i]==0)
			{
		     DFTraversal(i, visited);
			}
		}
    }
 
    public static void main(String args[])
    {
        DFS obj = new DFS(10);
        
        obj.addEdgesToGraph(1,2);
        obj.addEdgesToGraph(3,4);
        obj.addEdgesToGraph(4,5);
        obj.addEdgesToGraph(5,6);
        obj.addEdgesToGraph(2,7);
        obj.addEdgesToGraph(3,8);
        obj.addEdgesToGraph(3,6);
        obj.addEdgesToGraph(2,4);
        obj.addEdgesToGraph(4,9);
        
        
        
        obj.DFSearch(1);
    }
    
}
