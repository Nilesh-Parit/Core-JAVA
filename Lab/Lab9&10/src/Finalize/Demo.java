package Finalize;

public class Demo
{
	int i ;
	public Demo(int i)
	{
		super();
		this.i = i;
		System.out.println("in Constructor "+ i);
	}
	protected void finalize() throws Throwable
	{
		System.out.println(" in finalize " + i);
	}
	public static void main(String[] args) throws Throwable
	{
		Demo d = new Demo(1);
		d = new Demo(2);
		d = new Demo(3);
		d = new Demo(4);
		d = new Demo(5);
		System.gc();// force fully calling garbage collector
		d = new Demo(6);
		d = new Demo(7);
		d = new Demo(8);
		d = new Demo(9);
		d = new Demo(10);
		d = new Demo(11);
	//	d.finalize(); Garbage collector will call the finalize method implicitly
	}
}
