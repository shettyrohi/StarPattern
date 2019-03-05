
/*Output of this code
 	        **********
			**********
			**********
			**********
			**********
			**********
			**********
			**********
			**********
			**********

*/
import java.util.Scanner;
public class Pattern0 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

