package com.Abstraction;

public class MtrixSub extends Matrix{

	@Override
	public int[][] processArray(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] - b[i][j];
			}
		}
		return c;
	}

	@Override
	public void demo() {
		System.out.println("in demo mthod of matrix sub..");
	}

}
