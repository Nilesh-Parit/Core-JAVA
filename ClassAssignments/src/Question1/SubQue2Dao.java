package Question1;

public class SubQue2Dao
{
	static SubQue2Bean[] s1;
	private static int cnt = 0;
	
	static
	{
		s1[++cnt] = new SubQue2Bean(101, "Nilesh Parit", new int[]{85,80,90});
		s1[++cnt] = new SubQue2Bean(102, "Rohan More", new int[]{90,85,95});
	}
	
	
}
