/*Output of this code
                HOUSE

                                                  ****
                                                  ****
                                                  ****
                                                  ****
                   ******************************************
                  ********************************************
                 **********************************************
                ************************************************
               **************************************************
              ****************************************************
             ******************************************************
            ********************************************************
           **********************************************************
          ************************************************************
          *                  *                                       *
          *                  *          **********                   *
          *    *********     *          *   *    *                   *
          *    *   *   *     *          **********                   *
          *    *   *   *     *          **********                   *
          *    *   *   *     *                                       *
          *    *   *   *     *                                       *
          *    *   *   *     *                                       *
          *    *   *   *     *                                       *
          ************************************************************
 
 */

import java.util.Scanner;
public class HousePattern {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter a number");
		int n=scan.nextInt();
		// First Division		
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
				System.out.print(" ");
			}

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
				if(j>n/2&&i>n/2)
					System.out.print("*");
			}
			System.out.println();
		}
		// Second Division 		
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

			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<=n-i-1;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=0;j<n;j++)
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
        // Third Division		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if((j==0)||i==n-1||(j==n-1||j==n/2)&&i>n/4||i==n/4&&j>=n/2)
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
				if(j==n-1||i==n-1||j==n/2-2&&i>n/4||i==n/4&&j<n/2-1)
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
				if(i==n-1)
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
				if(i==n-1||(j==n/2-1||j==n-1||j==0)&&(i>n/4-1&&i<(3*n/4)-3)||i==n/4-1||i==(3*n/4)-3||i==n/2-2)
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
				if(i==n-1)
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
				if(i==n-1||j==n-1)
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
