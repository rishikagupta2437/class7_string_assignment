package class7;
 
import java.util.Scanner;
public class check_occurrence {
	public static void main(String[] args)
	{
		String a, b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String: ");
		a=sc.nextLine();
		
		System.out.println("Enter The String You Want To Check: ");
		b=sc.nextLine();
		
		if(a.contains(b)){
			System.out.println(a+ " Contains " +b);	
		}else{
			System.out.println(a+ " Does Not Contains " +b);
		}
	}

}
