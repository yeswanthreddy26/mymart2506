package com.mymart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Downloadapps")
public class Downloadapps {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String paystore;
	private String applestore;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPaystore() {
		return paystore;
	}
	public void setPaystore(String paystore) {
		this.paystore = paystore;
	}
	public String getApplestore() {
		return applestore;
	}
	public void setApplestore(String applestore) {
		this.applestore = applestore;
	}
	public Downloadapps(Long id, String paystore, String applestore) {
		super();
		this.id = id;
		this.paystore = paystore;
		this.applestore = applestore;
	}
	public Downloadapps() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Downloadapps [id=" + id + ", paystore=" + paystore + ", applestore=" + applestore + "]";
	}
	
	
}
