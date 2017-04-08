//Given an image represented by an NxN matrix, where each pixel in the image is 4
//bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
//1  2      3 1  		0,0    0,1      1,0  0,0
//3  4      4 2			1,0    1,1      1,1  0,1

package com.rotateimage;

public class RotateImg {

	public static void ReverseMatrix(int[][] matrix){
		
		int l=matrix.length;
		int temp;
	
		for(int i=0;i<l-1;i++){
			for(int j=0;j<l-1;j++){
				temp = matrix[i][j];
				matrix[i][j]=matrix[l-1-j][i];
				matrix[l-1-j][i]=matrix[j][l-1];
				matrix[j][l-1]=temp;
				
			}
			
		}
		
	}
	
	public static void main(String[] args){
		int matrix[][] = new int[][] { { 1, 2, 3,4,5},
				{ 6,7,8,9,10 }, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25} };
		ReverseMatrix(matrix);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}

