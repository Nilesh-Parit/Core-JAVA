import java.util.Scanner;

public class Mustor {

	static Employee[] salEmplist;
	
	static
	{
		 int cecount = 0; //Contract Employee Count
		 
		salEmplist= new Employee[20];
		
		 salEmplist[0]= new SalEmp("Nilesh Parit","9545203883","ndparit@sunbeam.in",10,Employee.setEmpId(),12000,4000);
		 salEmplist[1]= new SalEmp("Vishal Parit","9545203662","vcparit@acts.in",12,Employee.setEmpId(),14000,3000);
		 salEmplist[2]= new SalEmp("Vishvajeet Dabhole","9545201717","vtdabhole@vita.in",14,Employee.setEmpId(),16000,3500);
		 salEmplist[3]= new SalEmp("Shritej Belekar","9545200707","sdbelekar@iacsd.in",16,Employee.setEmpId(),13000,2000);
		 salEmplist[4]= new ContEmp("Rohan More", "9545202323", "rrmore@infoway.com",10,Employee.setEmpId(),++cecount, 20000, 12,
					250);
		 salEmplist[5]= new ContEmp("Rutuja Karale", "9545200763", "rtkarale@unlv.com",10,Employee.setEmpId(),++cecount, 20000, 12,
					250);
		 salEmplist[6]= new ContEmp("Kavita Jadhav", "9545202300", "kujadhav@mitaoe.com",10,Employee.setEmpId(),++cecount, 20000, 12,
					250);
		 salEmplist[7]= new ContEmp("Asma Shaikh", "9545200786", "ashaikh@knowit.com",10,Employee.setEmpId(),++cecount, 20000, 12,
					250);
		 
		 int empCount=8; //Total Employee Count
	}
	
	public static void addEmployee(int choice)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the Employee Name");
		String name=sc.nextLine();
		
		System.out.println("Enetr the Employee Mobile");
		String mobile = sc.nextLine();
		
		System.out.println("Enetr the Employee mail ID");
		String mailID = sc.nextLine();
		
		System.out.println("Enetr the Employee Dept No");
		int deptno = sc.nextInt();
		
		switch(choice) 
		{
			case 1 :
			break;
			
			case 2 :
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}