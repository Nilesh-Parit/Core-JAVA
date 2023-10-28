import java.time.LocalDate;

public class Employee
{
	static String sid;
	static int countSid=101;
	private String name;
	private int deptno;
	private LocalDate doj;
	private String mob;
	
	public Employee()	//Default Constructor
	{
		this(null,0,null,null);
		System.out.println("in employee default constructor");
	}
	public Employee(String name,int deptno,LocalDate doj,String mob) //Parameterized Constructor
	{
		this.name = name;
		this.deptno = deptno;
		this.doj = doj; 
		this.mob = mob;
		Employee.sid = generateSID(this.deptno);
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getDeptno()
	{
		return deptno;
	}
	public void setDeptno(int deptno)
	{
		this.deptno = deptno;
	}
	public LocalDate getDoj()
	{
		return doj;
	}
	public void setDoj(LocalDate doj)
	{
		this.doj = doj;
	}
	public String getMob()
	{
		return mob;
	}
	public void setMob(String mob)
	{
		this.mob = mob;
	}
	public String generateSID(int deptno) //Auto Generate sid
	{	
		String id=(""+deptno+countSid);
		countSid++;
		return id;
	}
	public static int getCountSid()
	{
		return countSid;
	}
	@Override
	public String toString() //Display all from employee
	{
		return "EMPLOYEE\n\t[ID="+sid+ ", name=" + name + ", deptno=" + deptno + ", doj=" + doj + ", mob=" + mob + "]\n";
	}
}
