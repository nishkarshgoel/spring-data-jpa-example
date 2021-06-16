package com.nix.example.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "student")
public class StudentEntity {

	@Id
	@SequenceGenerator(name = "student_seq", sequenceName = "sequence_1", allocationSize = 1, initialValue = 500000)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "firstName", nullable = false, columnDefinition = "TEXT")
	private String firstName;
	
	@Column(name = "lastName", nullable = false, columnDefinition = "TEXT")
	private String lastName;
	
	@Column(name = "email", nullable = false, unique = true, columnDefinition = "TEXT")
	private String email;
	
	@Column(name = "age", nullable = false)
	private Integer age;

	public StudentEntity(String firstName, String lastName, String email, Integer age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + "]";
	}

}
