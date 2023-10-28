import java.time.LocalDate;

public class Vendors extends Employee
{
	static String cid;
	static int countCid=901;
	private int payment;
	
	public Vendors() {
		this(0,null,0,null,null);
		System.out.println("in Vendor default constructor");
	}
	
	public Vendors(int payment,String name,int deptno,LocalDate doj,String mob)
	{
		super(name,deptno,doj,mob);
		this.payment = payment;
		Vendors.cid=generateCID(countCid);
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}
	
	public String generateCID(int count) //Auto Generate cid
	{	
		String id=(""+count);
		countCid++;
		return id;
	}
	public static String getCid()
	{
		return cid;
	}
	@Override
	public String toString() {
		return super.toString()+"VENDORS\n\t[payment=" + payment + "]\n";
	}
	
}
