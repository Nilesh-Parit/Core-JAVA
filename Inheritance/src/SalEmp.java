import java.time.LocalDate;

public class SalEmp extends Employee
{
	private int sal;
	private int bonus;
	
	public SalEmp()
	{
		this(null,0,null,null,0,0);
		System.out.println("in Salaried employee default constructor");
	}
	public SalEmp(String name,int deptno,LocalDate doj,String mob,int sal, int bonus)
	{
		super(name, deptno, doj, mob);
		this.sal = sal;
		this.bonus = bonus;
	}
	public int getSal()
	{
		return sal;
	}
	public void setSal(int sal)
	{
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SALARIED EMPLOYEE\n\t[sal=" + sal + ", bonus=" + bonus + "]\n\n";
	}
}

