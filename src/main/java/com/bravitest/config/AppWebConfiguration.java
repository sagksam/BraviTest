/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bravitest.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.bravitest.controller.PersonController;
import com.bravitest.dao.PersonDAOImpl;
import com.bravitest.servico.PersonService;


/**
 *
 * @author Paulo
 */
@EnableWebMvc
@ComponentScan(basePackageClasses={PersonDAOImpl.class, PersonService.class, PersonController.class})
public class AppWebConfiguration {
    
    @Bean 
    public InternalResourceViewResolver 
        internalResourceViewResolver() { 
            InternalResourceViewResolver resolver = new InternalResourceViewResolver(); 
            resolver.setPrefix("/WEB-INF/views/"); 
            resolver.setSuffix(".jsp"); 
            return resolver; 
        }
        

}
