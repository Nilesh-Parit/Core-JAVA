
public class MCQ1 {

	public static void main(String[] args)
	{
		String str = "abcde";
		System.out.println(str.substring(1,3));
		
		int x = 0;
		int y = 0;
		for(int z=0;z<5;z++)
		{	if((++x)>2 && (++y)>2)
			x++;					}
		System.out.println(x+" "+y);

	}

}
