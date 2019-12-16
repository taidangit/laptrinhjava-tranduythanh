package kyna.vn.model;

import java.io.Serializable;

public class Contact implements Serializable, Comparable<Contact> {
	private int id;
	private String name;
	private String phone;
	
	public Contact() {
		super();
	}
	public Contact(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return id+"-"+name+"-"+phone;
	}
	@Override
	public int compareTo(Contact o) {
		return this.phone.compareToIgnoreCase(o.phone);
	}

}
