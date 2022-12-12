package wilp;
import java.util.*;
public class ninetheen {
	static void divisible(int N)
    {
        int num = 1;
        while (num < N)
        {
            if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
            num++;	
        }
    } 
	
    public static void main(String []args)
    {
        int N = 170;
        divisible(N);
    }
}
