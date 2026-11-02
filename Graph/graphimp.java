// package Data_Structure_Algorithms.Graph;

import java.util.*;
public class graphimp {

    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(2);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(3);
        graph.get(3).add(3);
        graph.get(3).add(1);
        for(int i =0;i<n;i++){
            System.out.println(i+"->"+graph.get(i));
          
        }


        
    }
    
}

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int N = adj.size();
        boolean []visited = new boolean[N];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        visited[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);
            for(int n: adj.get(node)){
                if(!visited[n]){
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
        return res;
    
    }
}

