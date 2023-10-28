import java.time.LocalDate;

public class MustorRoll
{
	public static void main(String[] args)
	{
		// Up-casting
		System.out.println("---------------------------------");
		System.out.println("|          ❤ Upcasting	❤       |");
		System.out.println("---------------------------------");
		
		Employee e2 = new SalEmp("Rohan More",104,LocalDate.of(2023,11,07),"9850495343",50000,10000);
		System.out.println(e2);
		
		Employee e4 = new ContEmp(200000,"Vishal Parit",106,LocalDate.of(2023,11,02),"7030175248",70000, 5000);
		System.out.println(e4);
	
		
		// Down-casting
		System.out.println("---------------------------------");
		System.out.println("|         ❤ Downcasting	 ❤      |");
		System.out.println("---------------------------------");
		
		SalEmp e6 = (SalEmp)e2;
		System.out.println(e6);
		
		ContEmp e8 = (ContEmp)e4;
		System.out.println(e8);
		
		// Up-casting And Explicit Type Casting
		int i = ((ContEmp)e4).getComm();
		
		System.out.println("_________________________________");
		System.out.println("|   Salaried Employee Bonus  	|");
		System.out.println("---------------------------------");
		System.out.println("|     💋      "+i+"     💋       |");
		System.out.println("---------------------------------");
	
		
		// Up-casting And Explicit Type Casting
		i = ((SalEmp)e2).getBonus();
		
		System.out.println("_________________________________");
		System.out.println("| Contract Employee Commission	|");
		System.out.println("---------------------------------");
		System.out.println("|     💋      "+i+"     💋       |");
		System.out.println("---------------------------------");
	}
}
