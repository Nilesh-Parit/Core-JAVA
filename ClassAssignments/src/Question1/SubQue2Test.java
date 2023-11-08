package Question1;


import java.util.Scanner;

public class SubQue2Test
{
	public static void main(String[] args)
	{
		int choice=0;
		Scanner sc = new Scanner(System.in);
		SubQue2Service std3 = new SubQue2Service();

		do
		{
			System.out.println("1. Display all student");
			System.out.println("2. Search by Student ID");
			System.out.println("3. Search by Name");
			System.out.println("4. Calculate GPA");
			System.out.println("5. Add New Student");
			System.out.println("6. Exit/n");
			System.out.println("Enetr Your Choice...");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:	 	//Display All Student
				std3.displayAll();
				break;
			case 2:	 	// Search by id
				System.out.println("Enter student ID  : ");
				int id = sc.nextInt();
				std3.searchByID(id);
				break;
			case 3:	 	//Search by name
				System.out.println("Enter student name  : ");
				sc.nextLine();
				String name = sc.nextLine();
				std3.searchByName(name);
				break;
			case 4:	 	//calculate GPA of a student
				System.out.println("Enter student ID to create GPA : ");
				id = sc.nextInt();
				std3.createGPA(id);
				break;
			case 5:		//Add New Student
				std3.addStudent();
				break;
			case 6:	 	// Exit
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice Entered");
			}
		}while(choice!=0);
		sc.close();
	}
}
