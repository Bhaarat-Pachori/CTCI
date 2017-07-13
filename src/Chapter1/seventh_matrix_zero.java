package Chapter1;

import java.util.Scanner;

public class seventh_matrix_zero {
	
	static int rows=3;
	static int cols=4;
	
	public static int[][] reset_cols_rows(int [][]matrix, int zero_row, int zero_col) {
		
		// Set row to zero first.
		for(int rows=0; rows<3; rows++) {
			for(int cols=0;cols<4; cols++) {
				if(rows == zero_row) {
					matrix[rows][cols] = 0;
				}
				if(cols == zero_col) {
					matrix[rows][cols] = 0;
				}
			}
		}
		System.out.println();
		return matrix;
	}
	
	public static void main(String args[]) {
		
		boolean found_zero = false;
		int [][] matrix = new int [] [] {  
										  {1,2,3,4},
										  {5,6,0,8},
										  {9,9,9,9}
										};
		
		for(int rows=0; rows<3; rows++) {
			for(int cols=0;cols<4; cols++) {
				if(matrix[rows][cols] == 0 && !found_zero) {
					matrix = reset_cols_rows(matrix,rows,cols);
					found_zero = true;
				}
			}
		}
		
		for(int rows=0; rows<3; rows++) {
			for(int cols=0;cols<4; cols++) {
				System.out.print(matrix[rows][cols]);
				}
			System.out.println();
			}
		}
}