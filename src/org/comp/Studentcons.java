package org.comp;

public class Studentcons {
	
	private String name;
	private int id;
	private String collage;
	private long phone;
	private Student3 student;
	
	public Studentcons(String name,int id,String collage,long phone,Student3 student) {
		this.name=name;
		this.id=id;
		this.collage= collage;
		this.phone= phone;
		this.student=student;
		
	}
	
	public String toString() {
		return name+","+id+","+collage+","+phone+","+student;
	}
	
	public Student3 getStudent3() {
		return student;
	}
	
	public void SetStudent3(Student3 student) {
		this.student=student;
	}


}
