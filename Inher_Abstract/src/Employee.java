
public class Employee extends Person
{
	private static String empId;
	private static int deptNo;
	
	public Employee(String name, String mobile, String email, int deptNo, String empId)
	{
		super(name, mobile, email);
		this.empId = empId;
		this.deptNo = deptNo;
	}
	public String getEmpId()
	{
		return empId;
	}
	public static String setEmpId()
	{
		Employee.empId = EmpOpr.generateEmpID(deptNo);
		return Employee.empId;
	}
	public int getDeptNo()
	{
		return deptNo;
	}
	public void setDeptNo(int deptNo)
	{
		this.deptNo = deptNo;
	}
	@Override
	public String toString()
	{
		return super.toString()+"Employee [empId=" + empId + ", deptNo=" + deptNo + "]";
	}
}
