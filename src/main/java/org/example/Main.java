package org.example;

import org.example.ds.traverse.graph.BFS;
import org.example.ds.traverse.graph.DFS;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        BFS traverseBfs=new BFS();
//        traverseBfs.traverseGraph_bfs();

        DFS dfs=new DFS();
        dfs.traverseGraph_dfs(3);
//        }
    }
}