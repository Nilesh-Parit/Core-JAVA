package Multilevel_Inheritance;
import Child.Child;
import GrandParent.GrandParent;
import Parent.Parent;

public class MultiInheritance
{
	public static void main(String[] args)
	{
		GrandParent g = new GrandParent("Grand Father",4);
		System.out.println(g);
		
		GrandParent p = new Parent("Father",3,4);
		System.out.println(p);
		
		GrandParent c = new Child("Child",4,3,2);
		System.out.println(c);
		
//		c.childAssets();
	}
}
