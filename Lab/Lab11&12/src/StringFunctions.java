
public class StringFunctions {

	public static void main(String[] args)
	{
		String str="Hello";
		str=str+"World";
		
		String s1="Hello";
		String s2="Welcome";
		String s3="Welcome";        
		String s4="Hello";
		
		String s5=new String("Hello");
	
		System.out.println("s1.equals(s5) " + (s1.equals(s5)));
		System.out.println(s3.compareTo(s5));
		
		String s="NileshAnshu";
		System.out.println("Uppercase= "+s.toUpperCase());
		System.out.println("Lowercase= "+s.toLowerCase());
		System.out.println("Char at= "+s.charAt(2));
		System.out.println("Length= "+s.length());
		System.out.println("Index of= "+s.indexOf("s"));
		System.out.println("Last index of= "+s.lastIndexOf("s"));
		System.out.println(s.substring(3,6));
		
		StringBuilder sb=new StringBuilder("String Builder ");
		System.out.println(sb);
		sb.append("Test Append");
		System.out.println(sb);
		
		StringBuffer sb1=new StringBuffer("String Buffer");
		System.out.println(sb1);
		sb1.append(" Appended");
		System.out.println(sb1);
	}
}
