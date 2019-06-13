package com.Abstraction;

import java.util.Scanner;

public class Demo {

	
	public static void main(String[] args) {
		
		
		int[][] a , b , c;
		int n ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter n : " );
		n = scanner.nextInt();
		
		a = new int[n][n];
		b = new int[n][n];
		c = new int[n][n];
		
		System.out.println("Enter a values one by one : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Enter b values one by one : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		
		MtrixSub  mtrixSub = new MtrixSub();
		c = mtrixSub.processArray(a, b);
		mtrixSub.demo();
		
		System.out.println("Subtraction of two matrix : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + c[i][j]);
			}
			System.out.println();
		}
		
		
		MatrixAdd add = new MatrixAdd();
		c = add.processArray(a, b);
		add.demo();
		
		System.out.println("Addition of two matrix : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + c[i][j]);
			}
			System.out.println();
		}	
	}

}
