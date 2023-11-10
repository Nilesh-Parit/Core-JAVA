import java.util.Scanner;

public class ExceptionHandling
{

	public static void main(String[] args) throws MinBalanceException 
	{
		Scanner sc = new Scanner(System.in);
		int minBalance=5000;
		while(1!=0)
		{
			System.out.println("Enter Amount : ");
			int amount = sc.nextInt();

			if(amount<minBalance)
			{
				throw new MinBalanceException(minBalance);
			}
			else 
			{
				System.out.println("withdrawal Successful");
			}
		}
	}
}

class MinBalanceException extends Exception
{
	private int amount;
	public MinBalanceException(int amount)
	{
		this.amount=amount;
	}

	@Override
	public String getMessage()
	{
		return ("Minimum Balance Limit of "+amount+" Exeeded");
	}
}