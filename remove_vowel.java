package class7;
 
import java.util.Scanner;

public class remove_vowel {
public static void main(String[] args) {
	
	String s , strnew;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the string");
	s= sc.nextLine();
	
	System.out.println("remove all vowels");
	s= s.replaceAll("[aeiouAEIOU]","") ;
	
	System.out.println(s);
	 
	 
		
	}

}
