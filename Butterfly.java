/*       Output of this code
 
          *                *
          **              **
          ***            ***
          ****          ****
          *****        *****
          ******      ******
          *******    *******
          ********  ********
          ******************
          ********  ********
          *******    *******
          ******      ******
          *****        *****
          ****          ****
          ***            ***
          **              **
          *                *
 
 */
import java.util.Scanner;
public class Butterfly {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
//First Division		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-1-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-1-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
//Second division		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-2;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-2;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
