package wilp;
import java.util.*;
public class sixteen {
	 public static void main(String[] args) {
		 int i,j;
		 Scanner sc = new Scanner (System.in);
		 int size = sc.nextInt();
				 
		 for (i=1;i<=size;i++) {
			 for(j=1;j<=i;j++) {
				 
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
}
