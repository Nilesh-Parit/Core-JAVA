package Question1;

import java.util.Scanner;

public class SubQue2Dao
{
	static SubQue2Bean[] s1;
	private static int cnt = 0;

	static
	{   s1 = new SubQue2Bean[10];
		s1[0] = new SubQue2Bean(101,"Nilesh Parit", new int[]{85,80,90});
		s1[++cnt] = new SubQue2Bean(102, "Rohan More", new int[]{90,85,95});
	}

	public void save(SubQue2Bean std2)
	{
		s1[++cnt] = std2;
		System.out.println("Student info saved succefully at ID "+cnt);
	}

	public void createGPA(int id)
	{   

		for(SubQue2Bean s:s1)
		{
			if(s!=null)
			{	if(s.getStudid()==id)
				{
					double gpa= (1.0/3)*(s.getMarks()[0]+s.getMarks()[1]+s.getMarks()[2]);
					System.out.println("Marks is "+gpa);
					s.setGpa(gpa);
				}
			}
			else
				break;
		}

	}

	public void displayAll()
	{
		System.out.println("display");
		for(SubQue2Bean s:s1)
		{
			System.out.println("displays");
			
			if(s!=null)
			{	System.out.println("Student Details:");
				System.out.println("----------------");	
				System.out.println("Student Id : "+s.getStudid());	
				System.out.println("Name : "+s.getName());
				System.out.println("M1 : "+s.getMarks()[0]);
				System.out.println("M2 : "+s.getMarks()[1]);
				System.out.println("M3 : "+s.getMarks()[2]);
				System.out.println("GPA : "+s.getGpa());
				System.out.println("----------------");	
			}
			else break;
		}
	}

	public void searchByName(String name)
	{
		for(SubQue2Bean s:s1)
		{
			if(s!=null)
			{   
				if(s.getName().equalsIgnoreCase(name))
				{
					System.out.println(s);
				}
			}
			else
				{
					System.out.println("Student not found");
					break;
				}
		}
	}

	public void searchByID(int id) {
		for(SubQue2Bean s:s1) {
			if(s!=null) {
				if(s.getStudid()==id) {
					System.out.println(s);
				}
			}
			else break;
		}

	}
}
