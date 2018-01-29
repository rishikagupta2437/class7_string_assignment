package class7;

import java.util.Scanner;

public class substring {
	 
	public static void main(String[] args) {
		
		String string, sub;
		int i,a ;
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.println("enter the string");
		 string= sc.nextLine();
		
		  for(a=0;a<string.length();a++) {
			 
			 for(i=a+1;i<=string.length();i++) {
				 
				 sub= string.substring(a,i);
				 
				 System.out.println(sub);
				 
			 }
		 }
		 
	}

}
