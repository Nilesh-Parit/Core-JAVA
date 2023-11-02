
public class SalEmp extends Employee
{
	private int basicSal;
	private int bonus;
	
	public int calSal(int a,int b)
	{
		int totalSal = a + b;
		return totalSal;
	}
	public SalEmp(String name, String mobile, String email,int deptNo, String empID,int basicSal, int bonus)
	{
		super(name, mobile, email, deptNo,empID );
		this.basicSal = basicSal;
		this.bonus = bonus;
	}
	public int getBasicSal()
	{
		return basicSal;
	}
	public void setBasicSal(int basicSal)
	{
		this.basicSal = basicSal;
	}
	public int getBonus()
	{
		return bonus;
	}
	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	@Override
	public String toString()
	{
		return super.toString()+"SalEmp [basicSal=" + basicSal + ", bonus=" + bonus + "]";
	}
	
}
