import java.util.Scanner;
public class Table
{


	public static void table()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int multi;
		System.out.println("Enter a No.");
		num = sc.nextInt();
		System.out.println();
		System.out.println("__________________");
		System.out.println("|   Table of "+num+"  |");
		System.out.println("------------------");
		for(int i=1;i<=10;i++)
		{
			multi = num * i;
			System.out.println("       "+multi);
		}
		System.out.println("-----------------");
	}
}
