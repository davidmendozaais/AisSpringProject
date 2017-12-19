package com.ais.entity;

public class Address {
	
	private int idAddress;
	private String street;
	
	
	
	public int getIdAddress() {
		return idAddress;
	}
	
	public void setIdAddres(int idAddress) {
		this.idAddress = idAddress;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public Address(int idAddress, String street) {
		this.idAddress = idAddress;
		this.street = street;
	}
	
	public Address() {}

	@Override
	public String toString() {
		return "Address [idAddress=" + idAddress + ", street=" + street + "]";
	}
	
}
