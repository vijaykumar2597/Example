package org.comp;

public class EncapStudent {
	
	private String name;
	private int id;
	private long phone;
	private Student2 student;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String  getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setPhone(long phone) {
		this.phone=phone;
	}
	
	public long getPhone() {
		return phone;
	}
	
	public void setStudent2(Student2 student) {
		this.student=student;
	}

	public Student2 getStudent2() {
		return student;
	}
}
