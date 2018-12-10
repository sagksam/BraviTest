package com.bravitest.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bravistest.modelo.Person;
import com.bravitest.dao.PersonDAO;

@Service
public class PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	public void createPerson(Person person) {
		personDAO.createUser(person);
	}
	
	public Person getPerson(long id, Class clazz) {
		return personDAO.getPerson(id, clazz);
	}
	
	public void updatePerson(Person person) {
		
		personDAO.updatePerson(person);
	}
	
	public void deletePerson(Person person) {
		personDAO.deletePerson(person);
	}
}
