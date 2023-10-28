import java.time.LocalDate;

public class ContEmp extends Vendors
{
	private int sal;
	private int comm;
	
	public ContEmp()
	{
		super();
	}
	public ContEmp(int payment,String name,int deptno,LocalDate doj,String mob,int sal, int comm)
	{
		super(payment,name,deptno,doj,mob);
		this.sal = sal;
		this.comm = comm;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int sal)
	{
		this.sal = sal;
	}
	public int getComm()
	{
		return comm;
	}
	public void setComm(int comm)
	{
		this.comm = comm;
	}
	@Override
	public String toString() {
		return super.toString()+"CONTRACT EMPLOYEE\n\t[sal=" + sal + ", comm=" + comm + "]\n\n";
	}
	
	
	
}
