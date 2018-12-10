package com.bravistest.modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private long id;
	private String name;
	private String phone;
	private String email;
	private String whatsapp;
	
	public Person() {}
	
	/**
	 * @param name
	 * @param phone
	 * @param email
	 * @param whatsapp
	 */
	public Person(String name, String phone, String email, String whatsapp) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.whatsapp = whatsapp;
	}
	
	
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the whatsapp
	 */
	public String getWhatsapp() {
		return whatsapp;
	}
	/**
	 * @param whatsapp the whatsapp to set
	 */
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", whatsapp="
				+ whatsapp + "]";
	}

	
	
	
}
