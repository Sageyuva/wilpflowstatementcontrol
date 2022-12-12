package wilp;
import java.util.*;
public class twelve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int number=sc.nextInt();
	 for   ( i=2;i<=number;i++) {
			if(number%i==0) 
				
				break;
		}
	    if(number==i)
			System.out.println(number+" is prime");
	    else
			System.out.println(number+" is not a prime number");
}


}