/*Output of this code is
 
	*            ***************             *                          ***************
	**          ** *************            * *                        *****************
	* *        ***  ************           *   *                      *******************
	*  *      ****   ***********          *     *                    *********************
	*   *    *****    **********         *       *                  ***********************
	*    *  ******     *********        *         *                *************************
	*     ********      ********       *           *              ***************************
	*     ********      ********      *             *            *****************************
	*    *********     *  ******     *               *          *******************************
	*   **********    *    *****    *                 *        *********************************
	*  ***********   *      ****   *                   *      ***********************************
	* ************  *        ***  *                     *    *************************************
	************** *          ** *                       *  ***************************************
	***************            *********************************************************************
 */
import java.util.Scanner;
public class Pattern9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(j==0||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
				if(i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=n-i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				if(i==n-1||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<=i;j++)
			{
				if(i==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
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
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}
}



