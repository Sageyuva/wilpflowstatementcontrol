//program to check the given number is Odd or Even

import java.util.*;
import java.util.Scanner;

public class SecondProgram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Entered number is even");
		}	
		else
		{
			System.out.println("Entered number is odd");
		}


	}
}