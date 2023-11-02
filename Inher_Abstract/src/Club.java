
public class Club extends Person
{
	private String typeofMembership;
	private int amt;
	
	public Club(String name, String mobile, String email, String typeofMembership, int amt)
	{
		super(name, mobile, email);
		this.typeofMembership = typeofMembership;
		this.amt = amt;
	}
	public String getTypeofMembership()
	{
		return typeofMembership;
	}
	public void setTypeofMembership(String typeofMembership)
	{
		this.typeofMembership = typeofMembership;
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
		return super.toString()+"Club [typeofMembership=" + typeofMembership + ", amt=" + amt + "]";
	}
	
	
	
}
