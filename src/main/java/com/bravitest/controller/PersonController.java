package com.bravitest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bravistest.modelo.Person;
import com.bravitest.servico.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	 //Método que cria um Person e seus contatos
	 @RequestMapping(value="/create/", method = RequestMethod.POST, headers="Accept=application/json")
	 public ResponseEntity<Void> create(@RequestBody Person person){
		 personService.createPerson(person);
	  
	  HttpHeaders headers = new HttpHeaders();
	  return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	 }
	
	 //Método que recupera um Person e seus contatos
	 @RequestMapping(value="/get/{id}", method = RequestMethod.GET, headers="Accept=application/json")
	 public ResponseEntity<Person> get(@PathVariable("id") int id){
		 
		 Person person = personService.getPerson(id, Person.class);
		 return new ResponseEntity<Person>(person, HttpStatus.OK);
	 }
	 
	//Método que atualiza um Person e seus contatos
	 @RequestMapping(value="/update/{id}", method = RequestMethod.PUT, headers="Accept=application/json")
	 public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody Person person){
	  person.setId(id);
	  personService.updatePerson(person);
	  
	  HttpHeaders headers = new HttpHeaders();
	  return new ResponseEntity<Void>(headers, HttpStatus.OK);
	 }
	 
	//Método que deleta um Person e seus contatos
	 @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, headers="Accept=application/json")
	 public ResponseEntity<Void> delete(@PathVariable("id") int id, @RequestBody Person person){
	  person.setId(id);
	  personService.deletePerson(person);
	  
	  HttpHeaders headers = new HttpHeaders();
	  return new ResponseEntity<Void>(headers, HttpStatus.NO_CONTENT);
	 }

}
