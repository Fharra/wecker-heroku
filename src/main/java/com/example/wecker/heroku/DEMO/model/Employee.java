package com.example.wecker.heroku.DEMO.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "employees")
public class Employee {

	@ApiModelProperty(notes = "Employee ID")
	private long id;
	@ApiModelProperty(notes = "Employee first name")
	private String firstName;
	@ApiModelProperty(notes = "Employee last name")
	private String lastName;
	@ApiModelProperty(notes = "Employee email ID")
	private String emailAddress;

	public Employee() {
	}

	public Employee(String firstName, String lastName, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
	}

	@Id
	@Column(name = "id", nullable = false)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "firstname", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastname", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "emailaddress", nullable = false)
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailAddress + "]";
	}
}
