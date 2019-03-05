/*Output of this code
	 		      *                            ****************                            *************** ***************
	             ***                          * *     *     * **                          ***************   **************
	            *****                        **  *    *    *  ***                        ***************     *************
	           *******                      ***   *   *   *   ****                      ***************       ************
	          *********                    ****    *  *  *    *****                    ***************         ***********
	         ***********                  *****     * * *     ******                  ***************           **********
	        *************                ******      ***      *******                ***************             *********
	       ***************              ******************************              ***************               ********
	      *****************            ********      ***      *********            ***************                 *******
	     *******************          *********     * * *     **********          ***************                   ******
	    *********************        **********    *  *  *    ***********        ***************                     *****
	   ***********************      ***********   *   *   *   ************      ***************                       ****
	  *************************    ************  *    *    *  *************    ***************                         ***
	 ***************************  ************* *     *     * **************  ***************                           **
	****************************************************************************************                             *

 */
import java.util.Scanner;
public class Pattern8 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
		//triangles
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}

			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			//square
			for(int j=0;j<n;j++)
			{
				if(i==0||j==n/2||i==n/2||i==n-1||i==j||i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			//triangles
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=n-i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
