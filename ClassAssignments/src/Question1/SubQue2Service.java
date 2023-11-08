package Question1;
import java.util.Scanner;

public class SubQue2Service
{
	private SubQue2Dao std1;

	public SubQue2Service()
	{
		std1 = new SubQue2Dao();
	}
	
	public void addStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student id : ");
		int id = sc.nextInt();
		System.out.println("Enter student name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter student marks 1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter student marks 2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter student marks 3 : ");
		int m3 = sc.nextInt();
		SubQue2Bean std2 = new SubQue2Bean(id,name, new int[] {m1,m2,m3});
		std1.save(std2);
	}

	public void createGPA(int id)
	{
		std1.createGPA(id);
	}
	public void searchByName(String name)
	{
		std1.searchByName(name);
	}
	public void searchByID(int id)
	{
		std1.searchByID(id);
	}
	public void displayAll()
	{
		std1.displayAll();
	}
	
}
