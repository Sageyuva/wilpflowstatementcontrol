//Program to check the given number is Positive ,Negative  or Zero

import java.util.Scanner;
public class FirstProgram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("Entered number is +ve");
		}
		else if(a<0)
		{
			System.out.println("Entered number is -ve");
		}
		else
		{
			System.out.println("Entered number is Zero");
		}
	}

}
