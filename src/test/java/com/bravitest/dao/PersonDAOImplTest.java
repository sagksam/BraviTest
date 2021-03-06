package com.bravitest.dao;

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


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersonDAOImpl.class})
public class PersonDAOImplTest {

	@Autowired
	private PersonDAO dao;
	private Person mock;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		mock = new Person("Jose Silva", "(19)1998565878", "josesilva@terra.com.br", "(19)1998565878");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	public void testCreateUser() {
		
		dao.createUser(mock);
	}

	@Ignore
	public void testGetPerson() {
		
		mock = dao.getPerson(1, Person.class);
		assertEquals(mock.getId(), 1);
	}

	@Ignore
	public void testUpdatePerson() {
		
		mock = dao.getPerson(1, Person.class);
		mock.setEmail("josesilva@gmail.com");
		dao.updatePerson(mock);
		assertEquals("josesilva@gmail.com", mock.getEmail());
	}

	@Ignore
	public void testDeletePerson() {
		
		mock = dao.getPerson(1, Person.class);
		dao.deletePerson(mock);
	}

}
