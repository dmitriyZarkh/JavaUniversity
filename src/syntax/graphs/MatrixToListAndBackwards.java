package syntax.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MatrixToListAndBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] graph = new int[n][n];


        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;


        }

        System.out.println(Arrays.deepToString(graph));

        List<List<Integer>> graph2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph2.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] == 1) {
                    graph2.get(i).add(j);
                }
            }
        }

        for (int i = 0; i < graph2.size(); i++) {
            System.out.print("v " + i + " has connections with: ");
            for (int j = 0; j < graph2.get(i).size(); j++) {
                System.out.print(graph2.get(i).get(j) + ", ");
            }
            System.out.println();
        }
    }
}