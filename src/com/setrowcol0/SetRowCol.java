package com.setrowcol0;

public class SetRowCol {

	public static void Set_0(int[][] matrix){
		
		int len = matrix.length;
		int maxlen=0, i,j;		
		
		for(int s=0;s<len;s++){
			if(maxlen<matrix[s].length)
			maxlen=matrix[s].length;
		}
		
		int[] temp=new int[len*maxlen];
		int t=0;
		
		for(i=0;i<len;i++){
			for(j=0;j<matrix[i].length;j++){
				if(matrix[i][j]==0){
					temp[t]=i;
					t++;
					temp[t]=j;
					t++;
				}
			}			
		}
		t--;
		int q=0;
		
		for(i=0; i<=t;i=i+2){
			q=temp[i];
			for(int k=0;k<matrix[q].length;k++){
				matrix[q][k]=0;
			}
		}
		
		int u=0;
		
		for(j=1;j<=t;j=j+2){
			for(int r=0;r<matrix.length;r++){
				u=temp[j];
				if(u<matrix[r].length){
				matrix[r][u]=0;
				}
			}
		}
	}
	
	public static void main(String[] args){
		
		int[][] m = new int[][]{ {1,2,4}, {0,1,3,4},{1,0,8,9},{1,2,3,0,5}};
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
		Set_0(m);
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[i].length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
