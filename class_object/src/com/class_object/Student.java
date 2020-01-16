package com.class_object;

public class Student extends Person{
	int id;
	String province;
	public void setId(int id){
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getProvince() {
		return this.province;
	}
}
