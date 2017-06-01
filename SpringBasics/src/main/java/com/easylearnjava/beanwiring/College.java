package com.easylearnjava.beanwiring;

public class College {
	
	private Student student;
	
	
	public College(){
		
	}
	public College(Student std){
		this.student = std;
		
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	

}
