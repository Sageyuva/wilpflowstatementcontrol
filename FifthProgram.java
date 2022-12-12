import java.util.Scanner;
public class FifthProgram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Character :");
		char c=sc.next().charAt(0);
		int ascii=(int)c;
		if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122))
		{
			System.out.println("Alphabet");
		}
		else if(48<=ascii && 57>=ascii)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character...!");
		}
	}
}
