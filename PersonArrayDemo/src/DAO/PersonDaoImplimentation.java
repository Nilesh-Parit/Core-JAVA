package DAO;

import beans.Person;

public class PersonDaoImplimentation implements PersonDao
{
	static Person[] arr;
	static int count;
	
	static 
	{
		arr = new Person[20];
		arr[0]=new Person(101,"Neel","9130174017");
		arr[1]=new Person(102,"Ansh","9156346587");
		arr[2]=new Person(103,"Adi","9174554017");
		arr[3]=new Person(104,"Teja","913954017");
		count=4;
	}
	
	@Override
	public void save(Person p)
	{
		arr[count++]=p;
	}
	
	@Override
	public Person findById(int id)
	{
		for(Person p:arr)
		{
			if(p!=null) // To check whether object is present at array index 
			{
				if(id==p.getPid())
					return p;
			}else
				break;
		}
		return null;
	}

	@Override
	public Person[] findall()
	{
		return arr;
	}

}
