package com.gyanim.springboot.studentproducerservice.model;

public class Student {
	
	private int rollNo;
	private String name;
	private int age;
	private String className;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", className=" + className + "]";
	}
	
	

	

}
