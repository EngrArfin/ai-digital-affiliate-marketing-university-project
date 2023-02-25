package problem.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;
public class cycle {
    static int vertex, edge;
    static Scanner sc=new Scanner(System.in);
    static boolean isCyclicDisconnected(ArrayList<Integer> adv[], int V) { boolean visited[] =new boolean[V];
    Arrays.fill(visited,false); for (int i = 0; i < V; i++)
    if (!visited[i] && isCyclicConnected(adv, i, V, visited)) 
    return true;
    return false;
    }
    static void addEdge(ArrayList<Integer> adj[], int src, int des)
    {
        adj[src].add(des);
        adj[des].add(src);
        }
        static boolean isCyclicConnected(ArrayList<Integer> adj[], int s,int V, boolean visited[]){ int pr[] = new int[V];
        Arrays.fill(pr, -1);
        Queue<Integer> q = new LinkedList<>(); visited[s] = true;
        q.add(s);
        while (!q.isEmpty())
        {
            int u = q.poll();
            for (int i = 0; i < adj[u].size(); i++)
            {
                int v = adj[u].get(i);
                if (!visited[v])
                {
                visited[v] = true; q.add(v);
                pr[v] = u;
                }
                else if (pr[u] != v) return true;
                }
            }
            return false;
            }
            public static void main(String[] arg) { System.out.println("Enter the number of Edges: ");
            edge =sc.nextInt();
            System.out.println("Enter the number of Vertex: ");
            vertex =sc.nextInt();
            ArrayList <Integer> adv[] = new ArrayList[vertex]; 
            for(int i = 0; i < 4; i++)
            adv[i] = new ArrayList<>(); 
            System.out.println("Enter the Edges: "); 
            for(int i = 0; i < edge; i++){
                addEdge(adv, sc.nextInt(), sc.nextInt());
                }
                if (isCyclicDisconnected(adv, vertex)) System.out.println("Yes,There is Cycle");
                else
                System.out.println("No Cycle");
             }
}