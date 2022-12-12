package wilp;


import java.util.*;


public class seventh {

	
	  public static void main(String[] args) {
		  System.out.println("Enter the character");
		   Scanner sc = new Scanner (System.in);
		   char ch = sc.next().charAt(0);
		   
		   if(ch>='a'&&ch<='z') {
			   char ch2 = Character.toUpperCase(ch);
			  
			   System.out.println(ch2);
			   
		   }else {
			   char ch2 = Character.toLowerCase(ch);
			   System.out.println(ch2);
		   }
	  }
}
