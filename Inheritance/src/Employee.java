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
	}
	public Employee(String name,int deptno,LocalDate doj,String mob) //Parameterized Constructor
	{
		this.name = name;
		this.deptno = deptno;
		this.doj = doj; 
		this.mob = mob;
		Employee.sid = generateID(this.deptno);
	}
	public String generateID(int deptno) //Auto Generate sid
	{	
		String id=(""+deptno+countSid);
		countSid++;
		return id;
	}
	@Override
	public String toString() //Display all from employee
	{
		return "Employee\n\t[ID="+sid+ ", name=" + name + ", deptno=" + deptno + ", doj=" + doj + ", mob=" + mob + "]";
	}
}
