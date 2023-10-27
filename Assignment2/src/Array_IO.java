import java.util.Scanner;

public class Array_IO
{
	public static void inputArray(int[][] a)
	{
		//Array Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Row "+i);
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
		    }
	    }
		sc.close();
	}
	
	public static void displayArray(int[][] a)
	{
		//Array Output
		System.out.println("The Array Elements Are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
		    }
			System.out.println();
	    }
	
}}
