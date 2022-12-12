import java.util.scanner;
import java.util.*;

public class ThirdProgram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String :");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		if(s1.length()==0)
		{
			System.out.println("No values");
		}
		else if(s2.length()==0)
		{
			System.out.println("No values");
		}
		else
		{
			System.out.println(s1+","+s2);
		}
			
	}

}
