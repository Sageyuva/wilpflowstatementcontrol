package wilp;
import java.util.*;
public class twenty {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 int  useroption;
		 do {
			 System.out.println("Enter the 1st number");
			 int num1=sc.nextInt();
			 System.out.println("Enter the 2nd number");
			 int num2=sc.nextInt();

			 System.out.println("Enter 1 to add");
			 System.out.println("Enter 2 to subtract");
			 System.out.println("Enter 3 to exit");
			 int sum = num1+num2;
			 int diff= num1-num2;
			 
			  useroption = sc.nextInt();
			 switch(useroption) {
			 case 1:
				 System.out.println("The addition of "+num1+" "+ num2+" is: "+sum);
				 break;
			 case 2:
				 System.out.println("The subtraction of "+num1+" "+ num2+" is: "+diff);
				 break;
			 case 3:
				 System.out.println("Thank you");
				 break;
			 }
		 }while(useroption!=3);
		 
		 
	 }


}
