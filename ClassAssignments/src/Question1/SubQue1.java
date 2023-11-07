package Question1;

public class SubQue1
{
	public static void main(String[] args)
	{
		if(args.length>=3)
		{
			for(int i = 0;i<3;i++)
			{
				int num = Integer.parseInt(args[i]);
				boolean flag = false;
				if(num==1 || num < 1)
					System.out.println(num+" is not a prime no");
				for(int j=2;j<num;j++)
				{
					if(num%j==0)
						flag=true;
					if(flag)
						break;
				}
				if(flag)
				{
					System.out.println(num+" is not a prime no");
					System.out.println(num+" / 10"+" = "+num/10);
				}

				else
				{
					System.out.println(num+" is a prime no");
					for(int k = 1;k<=10;k++)
					{
						System.out.println(num+" * "+k+" = "+num*k);
					}
				}	
			}
		}
		else
		{System.out.println("Enter 3 No.");}
	}
}
