package com.bravitest.dao;

import com.bravistest.modelo.Person;

//Interface PersonDAO sua implementação é PersonDAOImpl
public interface PersonDAO {

	public void createUser(Person person);
	
	public Person getPerson(long id, Class clazz);
	
	public void updatePerson(Person person);
	
	public void deletePerson(Person person);
}
