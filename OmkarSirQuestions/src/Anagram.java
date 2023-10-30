import java.util.Scanner;
import java.util.Arrays;
public class Anagram
{
	public static void main(String[] args)
	  {
			Scanner sc = new Scanner(System.in);
			String str1, str2;
			boolean flag;

		    System.out.println("Enter first word");
		    str1 = sc.next();
		    System.out.println("Enter second word");
		    str2 = sc.next();

		    char[] chstr1 = new char[str1.length()];
		    char[] chstr2 = new char[str2.length()];
		    
		    chstr1 = str1.toCharArray();
		    chstr2 = str2.toCharArray();
		    
		    Arrays.sort(chstr1);
		    Arrays.sort(chstr2);

	    flag = Arrays.equals(chstr1, chstr2);

	    if (flag)
	    {
	      System.out.println("Anagramic Word😍");
	    } else
	    {
	      System.out.println("Not Anagramic word😫");
	    }
	    sc.close();
	  }
}
