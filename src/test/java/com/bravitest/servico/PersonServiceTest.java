package com.bravitest.servico;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bravistest.modelo.Person;
import com.bravitest.dao.PersonDAO;
import com.bravitest.dao.PersonDAOImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersonService.class, PersonDAOImpl.class})
public class PersonServiceTest {

	private Person mock; 
	@Autowired
	private PersonService personService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		mock = new Person("Maria Silva", "(19)1998565979", "mariasilva@terra.com.br", "(19)1998565979");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	public void testCreatePerson() {
		
		personService.createPerson(mock);
	}

	@Ignore
	public void testGetPerson() {
		
		mock = personService.getPerson(1, Person.class);
		assertEquals(1, mock.getId());
	}

	@Ignore
	public void testUpdatePerson() {
		mock = personService.getPerson(1, Person.class);
		mock.setEmail("mariasilva@gmail.com");
		personService.updatePerson(mock);
		assertEquals("mariasilva@gmail.com", mock.getEmail());
	}

	@Ignore
	public void testDeletePerson() {
		
		mock = personService.getPerson(1, Person.class);
		personService.deletePerson(mock);
	}

}
