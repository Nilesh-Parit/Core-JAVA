import java.util.Scanner;

public class Pattern
{
	public static void diamond()
	{
		//Create Diamond Pattern
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int rowNum = sc.nextInt();
		//Create top half of Diamond Pattern
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=rowNum;j>i;j--)
			{
				System.out.print("-");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//Create bottom half of Diamond Pattern
		for(int i=1;i<=rowNum-1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("-");
			}
			for(int k=i+1;k<=rowNum;k++)
			{
				System.out.print("*");
			}
			for(int l=rowNum-1;l>=i+1;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
