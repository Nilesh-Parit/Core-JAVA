package Services;
import java.util.Scanner;

import DAO.PersonDao;
import DAO.PersonDaoImplimentation;
import beans.Person;

public class PersonServiceImplimentation implements PersonService 
{
	private PersonDao pdao;
	
	
	public PersonServiceImplimentation()
	{
		pdao = new PersonDaoImplimentation();
	}

	@Override
	public void addNewPerson() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = sc.nextInt();
		System.out.println("Enter the Name");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter the Mobile");
		String mobile = sc.nextLine();
		
		Person p = new Person(id,name,mobile);
		pdao.save(p);
	}

	@Override
	public Person[] displayAll()
	{
		return pdao.findall();
	}

	@Override
	public Person displayById(int id)
	{
		return pdao.findById(id);
	}
	
	
}
