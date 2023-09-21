package com.transactional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sender")
public class SenderEntity {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int sentAmount;
	private int totalAmount;
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
	public int getSentAmount() {
		return sentAmount;
	}
	public void setSentAmount(int sentAmount) {
		this.sentAmount = sentAmount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
	
	

}
