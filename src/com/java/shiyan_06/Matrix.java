package com.java.shiyan_06;
import java.util.Arrays;
public class Matrix {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
		System.out.println("矩阵a:");
		printM(a);
		System.out.println("a的转置矩阵");
		printM(swap(a));
		System.out.println("矩阵b:");
		printM(b);
		System.out.println("b的转置矩阵");
		printM(swap(b));

		System.out.println("a + b:");
		printM(additive(a,b));

		System.out.println("a - b:");
		printM(subtraction(a,b));

		System.out.println("a x b:");
		printM(multiplication_a(a,b));


	}


	public static int[][] additive(int[][] matrix_a, int[][] matrix_b){
	       int[][] result1 = new int[matrix_a.length][matrix_a[0].length];
	       if(matrix_a.length == matrix_b.length && matrix_a[0].length == matrix_b[0].length){
	           for(int i = 0; i < matrix_a.length; i++){
	               for(int j = 0; j < matrix_a[0].length; j++){
	                  result1[i][j] = matrix_a[i][j] + matrix_b[i][j];
	               }
	           }
	       }
	       return result1;
	}


	public static int[][] subtraction(int[][] matrix_a, int[][] matrix_b){
		int[][] result2 = new int[matrix_a.length][matrix_a[0].length];
		if(matrix_a.length == matrix_b.length && matrix_a[0].length == matrix_b[0].length){
			for(int i = 0; i < matrix_a.length; i++){
				for(int j = 0; j < matrix_a[0].length; j++){
					result2[i][j] = matrix_a[i][j] - matrix_b[i][j];
				}
			}
		}
		return result2;
	}


	public static int[][] multiplication_a(int[][] matrix_a, int[][] matrix_b){
		int[][] result3 = new int[matrix_a.length][matrix_b[0].length];
		if(matrix_a.length == matrix_b[0].length){
			for(int i = 0; i < matrix_a.length; i++){
				for(int j = 0;j < matrix_a[0].length; j++){
					result3[i][j] = calculateSingleResult(matrix_a, matrix_b, i, j);
				}
			}
			return result3;
		}else{
			return null;
		}
	}
	public static int calculateSingleResult(int[][] matrix_a, int[][] matrix_b, int row, int col){
		int result = 0;
		for(int i = 0; i < matrix_a[0].length; i++){
			result += matrix_a[row][i] * matrix_b[i][col];
		}
		return result;
	}



	public static int[][] swap(int[][] matrix_a){
		int[][] ans = new int[matrix_a.length][matrix_a[0].length];
		for(int i = 0;i < ans.length;i++){
			for(int j = 0;j < ans[0].length;j++){
					ans[j][i] = matrix_a[i][j];
				}
			}
		return ans;
	}

	public static void printM(int[][] matrix_a){
		for (int[] t:matrix_a
			 ) {
			System.out.println(Arrays.toString(t));
		}
	}

}
