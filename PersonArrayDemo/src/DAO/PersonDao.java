package DAO;

import beans.Person;

public interface PersonDao
{
	void save(Person p);
	Person findById(int id);
	Person[] findall();
}
