package Graph;

import java.util.LinkedList;

public class Q3 {
	public static void main(String[] args) {
		String input = "0 1 0 3 1 2 3 2 3 4 2 5 4 5 6 7"; // 무방향 간선으로 해석
		int V = 8;

		LinkedList<Integer> adjList[] = new LinkedList[V];
		for (int i = 0; i < adjList.length; i++)
			adjList[i] = new LinkedList<>();
		String s[] = input.split("\\s+");
		for (int i = 0; i < s.length; i += 2) {
			int v1 = Integer.parseInt(s[i]);
			int v2 = Integer.parseInt(s[i + 1]);
			adjList[v1].add(v2);
			adjList[v2].add(v1);
		}
		for (int i = 0; i < adjList.length; i++)
			System.out.println("node " + i + " => " + adjList[i]);
		connected(adjList, V);
	}

	private static void connected(LinkedList<Integer>[] adjList, int V) {
		boolean visited[] = new boolean[V];
		int count = 0;
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == false) {
				dfs(adjList, V, visited, i);
				count++;
				System.out.println();
			}
		}
		System.out.println("개수 = " + count);
	}

	private static void dfs(LinkedList<Integer>[] adjList, int V, boolean[] visited, int v) {
		visited[v] = true;
		System.out.print(v + " ");
		for (Integer i : adjList[v]) {
			if (visited[i] == false)
				dfs(adjList, V, visited, i);
		}
	}

}
