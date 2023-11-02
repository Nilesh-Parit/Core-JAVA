
public class Vendor extends Employee 
{
	private int noOfCmp;
	private int amt;
	
	public int calTotalCharges()
	{
		int totalCharges = noOfCmp * amt;
		return totalCharges;
	}
	public Vendor(String name, String mobile, String email,int deptNo, String empId,  int noOfCmp, int amt)
	{
		super(name, mobile, email, deptNo, empId);
		this.noOfCmp = noOfCmp;
		this.amt = amt;
	}
	public int getNoOfCmp()
	{
		return noOfCmp;
	}
	public void setNoOfCmp(int noOfCmp)
	{
		this.noOfCmp = noOfCmp;
	}
	public int getAmt()
	{
		return amt;
	}
	public void setAmt(int amt)
	{
		this.amt = amt;
	}
	@Override
	public String toString()
	{
		return super.toString()+"Vendor [noOfCmp=" + noOfCmp + ", amt=" + amt + "]";
	}
	
}
