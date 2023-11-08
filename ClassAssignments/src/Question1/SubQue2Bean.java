package Question1;

import java.util.Arrays;

public class SubQue2Bean
{
	private int studid;
	private String name;
	private int[] marks;
	private double gpa;
	
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", gpa=" + gpa
				+ "]\n";
	}

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
}
