package org.comp;

public class StudentCall {
	public static void main(String[] args) {
		
	
	Student2 s=new Student2();
	s.setName("vijay");
	s.setId(18);
	s.setPhone(8122827838l);
	
	EncapStudent e=new EncapStudent();
	e.setName("fahadh");
	e.setId(30);
	e.setPhone(9962384747l);
	e.setStudent2(s);
	
	System.out.println(e.getName()+","+e.getId()+","+e.getPhone());
	System.out.println(e.getStudent2().getName()+","+e.getStudent2().getId()+","+e.getStudent2().getPhone());
	
	
	}
	
}
