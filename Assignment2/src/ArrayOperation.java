import java.util.Scanner;

public class ArrayOperation
{	
	public static void addArray(int[][] a,int[][] b,int[][] t)
	{
		//Addition of 2 Array in 3rd array
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++)
			{
				t[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	public static void transpose(int[][] a,int[][] t)
	{
		//Transpose of One Array into 2nd array
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++)
			{
				t[i][j]=a[j][i];
			}
		}
	}
	public static void findMax(int[][] a) 
	{    
		//Finding Maximum Element From the Array
		int max=0;
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++)
			{
				if(a[i][j]>max)
				{	max=a[i][j];	}  
			}
		}
		System.out.println("Max value is "+max);
	}
	public static void findMin(int[][] a) 
	{    
		//Finding Maximum Element From the Array
		int min=a[0][0];
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++)
			{
				if(a[i][j]<min)
				{	min=a[i][j];	}  
			}
		}
		System.out.println("Min value is "+min);
	}
	public static void findCount(int[][] a) 
	{    
		//Finding no. of occurances of given no. into the array
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter Array Element to Find No. of Occurences");
		int t = sc.nextInt();
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++) 
			{
				if(a[i][j]==t)
					count++; 
			}
		}
		System.out.println("No. of occurences are "+count);
	}
}