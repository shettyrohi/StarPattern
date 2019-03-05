/*Output of this Code
       Rocket
                             *
                            ***
                           *****
                          *******
                         *********
                        ***********
                       *************
                      ***************
                     *****************
                    *******************
                    *                 * 
                    *                 * 
                    *                 * 
                    *                 * 
                    *                 * 
                    *    **********   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    *        *   * 
                    *    **********   * 
                    *                 * 
                    *                 * 
                    *                 * 
                    ******************* 
                   *                   *
                  **                   **
                 ***                   ***
                ****                   ****
               *****                   *****
              ******                   ******
             *******                   *******
            ********                   ********
           *********                   *********
          ***************************************
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
                    *    *    *    *  * 
*/


import java.util.Scanner;
public class RocketPattern {
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
			for(int j=0;j<n;j++)
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
			for(int j=0;j<=i;j++)
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
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{ 
				if(j==0||j==n/2&&i>n/2||i==n/2&&j>n/2-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{ 
				if(j==n-2||j==n/2-1&&i>n/2||i==n/2&&j<n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//third division
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{ 
				if(j==0||j==n/2&&i<n/2||i==n/2&&j>n/2-1||i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{ 
				if(j==n-2||j==n/2-1&&i<n/2||i==n/2&&j<n/2||i==n-1&&j!=n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//Fourt division
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
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
				if(i==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n-1;j++)
			{
				if(i==n-1)
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
			System.out.println();
		}
		//Sixth division
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n/2||j==n-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}