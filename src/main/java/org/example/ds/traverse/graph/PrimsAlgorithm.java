package org.example.ds.traverse.graph;

public class PrimsAlgorithm {

    public void getMinSpanningTree(int head){
        int [][] adjancy_matrix={
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };
        int len=adjancy_matrix.length;
        int parent[]=new int[len];
        int weight[]=new int[len];
        boolean [] visited=new boolean[len];

        for(int i=0;i<len;i++){
            parent[i]=-1;
            weight[i]=Integer.MAX_VALUE;
            visited[i]=false;
        }

        weight[0]=0;
        for(int i=0;i<len-1;i++){
            int u=minWeight(weight,visited);
            visited[u]=true;

            for(int v=0;v<len;v++){
                if(adjancy_matrix[u][v]!=0 && visited[v]==false && adjancy_matrix[u][v]<weight[v]){
                    weight[v]=adjancy_matrix[u][v];
                    parent[v]=u;
                }
            }
        }

        int total_cost=0;
        for(int i=0;i<len;i++){
            total_cost+=weight[i];
        }
        System.out.println("Total cost to reach all vertices "+total_cost);


    }

    private int minWeight(int [] weigth,boolean [] visited){

        int len=weigth.length;
        int min=Integer.MAX_VALUE;
        int min_index=-1;

        for(int v=0;v<len;v++){
            if(visited[v]==false && weigth[v]<min){
                min=weigth[v];
                min_index=v;
            }
        }
        return min_index;
    }
}
