
public class EmpOpr
{
	static int count = 101;
	public static String generateEmpID(int deptNo)
	{
		String id = (""+deptNo+count);
		count++;
		return id;
	}
}
