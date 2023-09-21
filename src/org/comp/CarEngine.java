package org.comp;

public class CarEngine {

	public static void main(String[] args) {
		
		Engine e=new Engine();
		e.brand="hynadai";
		
	    e.price=230000;
	    e.weight=55;
	    
	    
	    Car c=new Car();
	    c.brand="BMW";
	    c.price=500000;
	    c.color="black";
	    c.model="abs";
	    c.engine=e;
	    
	    System.out.println(c.brand+","+c.price+","+c.color+","+c.model+","+c.engine.brand+","+c.engine.price);
	    
		
	}
}
