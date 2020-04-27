package com.stackroute.springboot.rest.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "emp_details")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="emp_id")
	private int id;
	@Column(name ="emp_name")
	
	private String name;
	@Column(name ="emp_email")
	private String email;
	@Column(name ="emp_contactno")
	private String contactNo;
	
	@Column(name ="emp_age")
	private int age;
	
	@Column(name = "emp_join_date")
	private Date joinDate;
	@Column(name = "emp_salary")
	private double salary;
	@Column(name = "emp_regular")
	@Type(type =  "org.hibernate.type.BooleanType")
	private boolean regular;
	
	
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isRegular() {
		return regular;
	}
	public void setRegular(boolean isRegular) {
		this.regular = isRegular;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo + "]";
	}
	
	

}
