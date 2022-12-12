import java.util.Scanner;

public class SixthProgram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		boolean female = false;
		boolean male = true;
		boolean m= male;
		boolean f= female;
		System.out.println("Enter Gender :");
		boolean b=sc.nextBoolean();
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		if ((b==false)&&(age>=1 && age<=58))
		{
			System.out.println("Interest = 8.2%");
		}
		else if((b==false)&&(age>=59 && age<=120))
		{
			System.out.println("Interest = 7.6%");
		}
		else if((b==true)&&(age>=1 && age<=60))
		{
			System.out.println("Interest = 9.2%");
		}
		else if((b==true)&&(age>=61 && age<=120))
		{
			System.out.println("Interest = 8.3%");
		}
		else 
		{
			System.out.println("Enter Correct Entries ");
		}
	}
}
