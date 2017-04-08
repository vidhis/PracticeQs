import java.util.*;

public class DupChar {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String inputStr = null;
		
		inputStr = s.nextLine();
		char[] arr;
		boolean flag=false;
		int pos=0;
		
		arr = inputStr.toCharArray();
		
		for(int i=0; i<arr.length-1 && flag!=true;i++){
			for(int j=i+1; j<arr.length && flag!=true;j++){
				if(arr[i]==arr[j]){
					flag = true;
					pos=i;
					break;
				}
			}
			
		}
		
		if(flag==true)
			System.out.println("The first character to be duplicated is "+arr[pos]);
		else
			System.out.println("No duplicate characters found");
		
	}
	
}
