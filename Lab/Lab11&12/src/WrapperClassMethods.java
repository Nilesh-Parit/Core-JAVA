
public class WrapperClassMethods
{
	public static void main(String[] args)
	{		
			Integer I = Integer.valueOf("17"); 
	        System.out.println(I); 
	        
	        Double D = Double.valueOf("21.3"); 
	        System.out.println(D); 
	        
	        Boolean B = Boolean.valueOf("true"); 
	        System.out.println(B);
	        
	        int i = Integer.parseInt("10");
	        System.out.println(i);
	        
	        double d = Double.parseDouble("10.5"); 
	        System.out.println(d);
	        
	        Integer I2 = new Integer(10); 
	        String s = I2.toString(); 
	        System.out.println(s); 
		}
}

