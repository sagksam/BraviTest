package com.bravitest.factory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class BuildSessionFactory {

	/** Método utilizado para a criação de um SessionFactory
     * */
    public static SessionFactory getSessionFactory(){
    
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        return sessionFactory;
        
    }
}
