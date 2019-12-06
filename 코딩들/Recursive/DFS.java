package Recursive;

import java.util.Random;

public class DFS {
	private static int size;

	public static void main(String[] args) {
		int R = 5, C = 5, count = 0;
		char ground[][] = new char[R][C];
		Random random = new Random();
		for (int i = 0; i < ground.length; i++) { // ���� ������ �������� ���� ��� ����
			for (int j = 0; j < ground[i].length; j++)
				ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
		}
		for (int i = 0; i < ground.length; i++) { // ��� ���
			for (int j = 0; j < ground[i].length; j++)
				System.out.print(ground[i][j]);
			System.out.println();
		}
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == '1') { // ���� ���̸� dfs �湮 ����
					size = 0;
					dfs(ground, R, C, i, j);
					count++;
					System.out.println(size);
				}
			}
		}
		System.out.println(count);
	}

	private static void dfs(char[][] ground, int R, int C, int i, int j) {
		size++;
		ground[i][j] = '0'; // �湮ǥ�� (���������� ����)

		for (int dx = -1; dx <= 1; dx++) {
			for (int dy = -1; dy <= 1; dy++) {
				int r = i + dx, c = j + dy;
				if (r >= 0 && r < R && c >= 0 && c < C && ground[r][c] == '1')
					dfs(ground, R, C, r, c);
			}
		}
		/*
		 * if (ground[i-1][j-1] == '1' && i-1>=0 && j-1>=0) dfs(ground, R, C, i-1, j-1);
		 * 
		 * if (ground[i-1][j] == '1' && i-1>=0) dfs(ground, R, C, i-1, j);
		 * 
		 * if (ground[i-1][j+1] == '1' && i-1>=0 && j+1<C) dfs(ground, R, C, i-1, j+1);
		 * 
		 * if (ground[i][j-1] == '1' && j-1>=0) dfs(ground, R, C, i, j-1);
		 * 
		 * if (ground[i][j+1] == '1' && j+1<C) dfs(ground, R, C, i, j+1);
		 * 
		 * if (ground[i+1][j-1] == '1' && i+1<R && j-1>=0) dfs(ground, R, C, i+1, j-1);
		 * 
		 * if (ground[i+1][j] == '1' && i+1<R) dfs(ground, R, C, i+1, j);
		 * 
		 * if (ground[i+1][j+1] == '1' && i+1<R && j+1<C) dfs(ground, R, C, i+1, j+1);
		 */
	}
}
