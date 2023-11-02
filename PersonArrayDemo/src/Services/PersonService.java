package Services;

import beans.Person;

public interface PersonService {
	
	void addNewPerson();
	Person[] displayAll();
	Person displayById(int id);
	

}
