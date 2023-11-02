package Test;

import java.util.Scanner;
import Services.PersonService;
import Services.PersonServiceImplimentation;
import beans.Person;

public class PersonTest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		PersonService ps= new PersonServiceImplimentation();
		int choice;

		do
		{
			System.out.println("1.add new person\n 2. display by id\n3. display all\n4. exit\n choice:");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				ps.addNewPerson();
				break;
			case 2:
				System.out.println("enetr pid");
				int pid=sc.nextInt();
				Person p=ps.displayById(pid);
				if(p!=null) {
					System.out.println(p);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 3:
				Person[]	arr= ps.displayAll();
				for(Person a:arr)
				{
					if(a!=null)
					{
						System.out.println(a);
					}else 
						break; 
				}
				break;
			case 4:
				System.out.println("Thank you for visiting...❤❤❤");
				break;
			default:
				System.out.println("wrong choice...😫");
				break;
			}
		}while(choice!=0);
		sc.close();
	}
}
