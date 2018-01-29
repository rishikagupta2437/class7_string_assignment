package class7;

import java.util.Scanner;

public class word_count {
	
	public static void main(String[] args) {
		String s;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string");
		
		s= sc.nextLine();
		
		String[] i= s.split(" ");
				
			System.out.println("no. of words in string"+i.length);	
		}
	}


