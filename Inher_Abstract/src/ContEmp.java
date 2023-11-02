
public class ContEmp extends Vendor
{
	private int hrs;
	private int rate;
	
	public int calCharges()
	{
		int charges = hrs * rate;
		return charges;
	}
	public ContEmp(String name, String mobile, String email, int deptNo,String empId,  int noOfCmp, int amt, int hrs,
			int rate)
	{
		super(name, mobile, email, deptNo, empId,  noOfCmp, amt);
		this.hrs = hrs;
		this.rate = rate;
	}
	public int getHrs()
	{
		return hrs;
	}
	public void setHrs(int hrs)
	{
		this.hrs = hrs;
	}
	public int getRate()
	{
		return rate;
	}
	public void setRate(int rate)
	{
		this.rate = rate;
	}
	@Override
	public String toString()
	{
		return super.toString()+"ContEmp [hrs=" + hrs + ", rate=" + rate + "]";
	}
	
}
