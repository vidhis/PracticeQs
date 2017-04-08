package com.countocc;

public class CountOccs {

	public static char[] CountIt(char[] c){
		
		char[] temp=new char[c.length*2];
		int tcnt=0;
		int charcnt=0;
		
		for(int i=0;i<c.length-1;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					charcnt++;
					c[j]='!';
				}
			}
			if(c[i]!='!'){
			temp[tcnt]=c[i];
			tcnt++;
			temp[tcnt]=(char)(charcnt+'1');
			tcnt++;
			}
		}
		
		return temp;
	}
	
	public static void main(String[] args){
		
		char[] str = {'1', '2', '2'};
		char[] val;
		val=CountIt(str);
		
		for(int v=0;v<val.length;v++)
			System.out.println(val[v]);
		
	}
	
}
