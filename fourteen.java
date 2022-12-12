package wilp;
import java.util.*;

public class fourteen {
	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in) ;
		 int i;
		 int number = sc.nextInt();
		 
		 
	if(number<=1) {
		System.out.println(number+ " is neighter composite nor prime");
	}else {
		 for   ( i=2;i<=number;i++) {
				if(number%i==0) 
					
					break;
			}
		    if(number==i)
				System.out.println(number+" is prime");
		    else
				System.out.println(number+" is composite");
	}
	 }
}
