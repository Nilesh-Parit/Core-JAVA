package Question1;

public class SubQue2Bean
{
	private int studid;
	private String name;
	private int[] marks;
	
	public SubQue2Bean(int studid, String name, int[] marks) 
	{
		this.studid = studid;
		this.name = name;
		this.marks = marks;
	}

	public int getStudid()
	{
		return studid;
	}

	public void setStudid(int studid)
	{
		this.studid = studid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int[] getMarks()
	{
		return marks;
	}

	public void setMarks(int[] marks)
	{
		this.marks = marks;
	}

	public void display()
	{
		System.out.println("Student Details:");
		System.out.println("_______________");	
		System.out.println("Student Id : "+studid);	
		System.out.println("Name : "+name);
		System.out.println("M1 : "+marks[0]);
		System.out.println("M2 : "+marks[1]);
		System.out.println("M3 : "+marks[2]);
	}
	
}
