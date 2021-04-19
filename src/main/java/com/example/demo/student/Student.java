package com.example.demo.student;

import java.time.LocalDate;

public class Student {
	private long id;
	private String name;
	private int age;
	private LocalDate dob;
	private String mail;
	
	public Student(long id, String name, int age, LocalDate dob, String mail) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.mail = mail;
	}
	
	public Student() {
		
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the dob
	 */
	public LocalDate getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Student(String name, int age, LocalDate dob, String mail) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.mail = mail;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", mail=" + mail + "]";
	}
	
	
}
