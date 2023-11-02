
public class MCQ
{
	public void myMethod()
	{
		System.out.println("Method");
	}
	{
		System.out.println("Instance Block");
	}
	public void MCQ()
	{
		System.out.println("Constructor");
	}
	static
	{
		System.out.println("Static Block");
	}
	
	public static void main(String[] args)
	{
		MCQ mcq = new MCQ();
		mcq.MCQ();
		mcq.myMethod();
	}

}
