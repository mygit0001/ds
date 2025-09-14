package org.example.ds.dijkstra;

public class DijkstraAlgo {

    public void getMinimumSpanningTree(){
        int [][]adjMatrix={
                {0,2,0,4,0,0},
                {0,0,3,2,0,0},
                {0,0,0,0,0,4},
                {0,0,0,0,2,0},
                {0,0,0,0,0,1},
                {0,0,0,0,0,0}
        };
        int v=adjMatrix.length;

        int distance[]=new int[v];
        dijkstraAlgo(adjMatrix,distance,0,v);

        for(int i=0;i<distance.length;i++){
            System.out.print(distance[i]+" ");
        }

    }

    private void dijkstraAlgo(int[][] adjMatrix, int[] distance, int src,int v) {
        boolean [] visited=new boolean[v];
        distance[src]=0;
        for(int i=0;i<v;i++){
            if(src==i)
                continue;
            distance[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<v;i++){
            int minV=findMinV(distance,visited);
            visited[minV]=true;

            for(int j=0;j<v;j++){
                if(adjMatrix[minV][j]!=0 && visited[j]==false && distance[minV]!=Integer.MAX_VALUE){
                    int newDist=distance[minV]+adjMatrix[minV][j];
                    if(newDist<distance[j]){
                        distance[j]=newDist;
                    }
                }
            }
        }

    }

    private int findMinV(int[] distance, boolean[] visited) {
        int minV=-1;
        for(int i=0;i<distance.length;i++){
            if(visited[i]==false && (minV==-1 || distance[i]<distance[minV])){
                minV=i;
            }
        }
        return minV;
    }


}
