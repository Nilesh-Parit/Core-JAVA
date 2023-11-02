
public class MCQ2
{
	static int a = 10;
	static int n;
	int b = 5;
	int c;
	
	public MCQ2()
	{ }
	
	public MCQ2(int m)
	{
		System.out.println(a+","+b+","+c+","+n+","+m);
	}
	//instance block
	{
		b=30;
		n=20;
	}
	static //static block
	{
		a=60;
	}
	public static void main(String[] args)
	{
		MCQ2 obj = new MCQ2(n);
	}
	
	
}
