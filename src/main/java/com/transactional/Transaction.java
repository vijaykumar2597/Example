package com.transactional;

public class Transaction {
	
	private SenderEntity sender;
	private ReciverEntity reciver;
	
	
	public SenderEntity getSender() {
		return sender;
	}
	public void setSender(SenderEntity sender) {
		this.sender = sender;
	}
	public ReciverEntity getReciver() {
		return reciver;
	}
	public void setReciver(ReciverEntity reciver) {
		this.reciver = reciver;
	}
	
	

}
