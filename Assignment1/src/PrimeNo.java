import java.util.Scanner;

public class PrimeNo
{
	public static void primeNo()
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int count=0;
		System.out.println("Enter a No.");
		num = sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			count++;
			if(count==1)
			break;
		}
		if(count==1)
		System.out.println("It is a prime no.");
		else
		System.out.println("It is not a prime no.");	
	}	
}
