package org.comp;

public class Student3 {
	
	private String name;
	private int id;
	
	public void setName(String name) {
		this.name=name;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
	
	public int getId(int id) {
		return id;
	}
	
	public Student3(String name,int id) {
		this.name=name;
		this.id=id;
		
	}
	
	public String toString() {
		return name+","+id;
	}

}
