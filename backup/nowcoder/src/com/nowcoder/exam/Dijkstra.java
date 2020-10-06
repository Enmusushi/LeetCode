package com.nowcoder.exam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Mgragh {
	char[] vexs;
	int[][] edges;
	int n, e;
}

//错误
public class Dijkstra {
	private static final int FINITY = 3001;

	public void createMatrix(Mgragh g) {
		File file = new File(
				"/home/enmusushi/environments/eclipse-jee-2020-06-R-linux-gtk-x86_64/WorkSpace/nowcoder/src/com/nowcoder/exam/g13.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			int row = 0;
			while ((line = br.readLine()) != null) {
				String[] nums = line.split(" ");
				if (row == 0) {
					g.n = Integer.valueOf(nums[0]);
					g.e = Integer.valueOf(nums[1]);
					g.edges = new int[g.n][g.n];
					for(int i=0;i<g.n;i++) {
						for(int j=0;j<g.n;j++) {
							if(i==j) {
								g.edges[i][j]=0;
							}else {
								g.edges[i][j]=Dijkstra.FINITY;
							}
						}
					}
				} else if (row == 1) {
					g.vexs = new char[nums.length];
					for (int i = 0; i < nums.length; i++) {
						g.vexs[i] = nums[i].charAt(0);
					}
				} else {
					int i = Integer.valueOf(nums[0]);
					int j = Integer.valueOf(nums[1]);
					int value= Integer.valueOf(nums[2]);
					g.edges[i][j]=value;
				}
				row++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void printInputData(Mgragh g) {
		System.out.println(g.n + " " + g.e);
		int i, j;
		for (i = 0; i < g.n - 1; i++) {
			System.out.print(g.vexs[i] + " ");
		}
		System.out.println(g.vexs[i]);

		for (i = 0; i < g.edges.length; i++) {
			for (j = 0; j < g.edges[i].length - 1; j++) {
				System.out.printf("%-5d ",g.edges[i][j]);
			}
			System.out.println(g.edges[i][j]);
		}
	}

	public void dijkstra(Mgragh g, int v0) {
		int[] p = new int[g.n];
		int[] d = new int[g.n];
		boolean[] finalRes = new boolean[g.n];
		int i, j, k, v, min = 0, x;
		for (v = 0; v < g.n; v++) {
			finalRes[v] = false;
			d[v] = g.edges[v0][v];
			if (d[v] < Dijkstra.FINITY && d[v] != 0) {
				p[v] = v0;
			} else {
				p[v] = -1;
			}
		}
		finalRes[v0] = true;
		d[v0] = 0;
		for (i = 1; i < g.n; i++) {
			min = Dijkstra.FINITY;
			for (k = 0; k < g.n; k++) {
				if (!finalRes[k] && d[k] < min) {
					v = k;
					min = d[k];
				}
			}
			System.out.println(g.vexs[v] + " " + min);
			if (min == Dijkstra.FINITY) {
				return;
			}
			finalRes[v]=true;
			for (k = 0; k < g.n; k++) {
				int temp = min + g.edges[v][k];
				if (!finalRes[k] && temp < d[k]) {
					d[k] = temp;
					p[k] = v;
				}
			}
		}
	}

	public static void main(String[] args) {
		Dijkstra dijkstra = new Dijkstra();
		Mgragh g = new Mgragh();
		dijkstra.createMatrix(g);
		dijkstra.printInputData(g);
		dijkstra.dijkstra(g, 0);
	}

}
