package com.bravitest.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.bravistest.modelo.Person;
import com.bravitest.factory.BuildSessionFactory;

@Repository
public class PersonDAOImpl implements PersonDAO{

	private Session session = BuildSessionFactory.getSessionFactory().openSession();
	
	//Método que cria um Person no banco de dados
	@Override
	public void createUser(Person person) {
		
		
        try {    		
    		session.getTransaction().begin();
    		session.save(person);
    		session.getTransaction().commit();
    	}
    	catch(HibernateException e) {
    	    session.getTransaction().rollback();
    		e.printStackTrace();
    	}
    	finally {
    		session.clear();
    	}

	}
	
	//Método que recupera um Person no banco de dados
	@Override
	public Person getPerson(long id, Class clazz) {
		
		Person person = new Person();
		
		try {
			
			session.getTransaction().begin();
			person = (Person) session.get(clazz, id);
			session.getTransaction().commit();
		}
		catch(HibernateException e) {
			
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		finally {
			
			session.clear();
		}
		
		return person;
	}

	//Método que atualiza um Person no banco de dados
	@Override
	public void updatePerson(Person person) {
		
		try {
			
			session.getTransaction().begin();
			session.merge(person);
			session.getTransaction().commit();
		}
		catch(HibernateException e) {
			
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		finally {
			
			session.clear();
		}
		
	}

	//Método que deleta um Person no banco de dados
	@Override
	public void deletePerson(Person person) {
		
		try {
		  session.getTransaction().begin();
		  session.delete(person);
		  session.getTransaction().commit();
		}
        catch(HibernateException e) {
			
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		finally {
			
			session.clear();
		}
		
	}

}
