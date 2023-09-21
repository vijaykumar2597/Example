package com.transactional;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="reciver")
public class ReciverEntity {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int recivedAmount;
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
	public int getRecivedAmount() {
		return recivedAmount;
	}
	public void setRecivedAmount(int recivedAmount) {
		this.recivedAmount = recivedAmount;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
