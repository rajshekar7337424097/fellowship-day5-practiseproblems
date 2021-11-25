package array2d;

import java.io.PrintWriter;

import java.util.Scanner;

public class TwoDarray {
	
	static Scanner sc;


	public static void main(String[] args) {

		System.out.println("enter number of rows");

		sc = new Scanner(System.in);

		int m = sc.nextInt();

		System.out.println("enter number of column");
		int n = sc.nextInt();

		// sc.close();
		System.out.println("row :"+m+ "column :"+n);
		if (m > 0 && n > 0) {
			TwoDarray twoDarray = new TwoDarray();
			twoDarray.setArryValues(m, n);

		}else {
			System.out.println("invalid input");
		}
	}

	public void setArryValues(int row, int col ) {
		int[][] twoDarr = new int [row][col];
		for (int i = 0; i < row; i++ ) {
			for (int j = 0; j < col; j++ ) {
				System.out.println("enter value of ["+ i +"] ["+ j +"] =>");
				twoDarr[i][j] = sc.nextInt();
			}
		}
		sc.close();

		TwoDarray twoDarray = new TwoDarray();
		twoDarray.printArrayValue(twoDarr, row, col);

	}
	public void printArrayValue(int[][] twoDarr,int row,int col) {
		try {
			PrintWriter writer = new PrintWriter("c:array.txt");


			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					writer.write("" + twoDarr[i][j]+"\t");
					writer.flush();
				}
				writer.write("\n");
				writer.flush();
			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Exception occurs");
			e.printStackTrace();
		}
	}

}
