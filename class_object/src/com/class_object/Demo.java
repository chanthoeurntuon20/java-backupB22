package com.class_object;

public class Demo {

	public static void main(String[] args) {
		Student su = new Student();
		
		su.setProvince("Kompong Cham");
		su.setAge(20);
		su.setName("YaYa");
		su.setId(20);
	
		System.out.println(
			su.getAge() + " "
			+ su.getName() + " "
			+ su.getAge() + " "
			+ su.getProvince() + " "
		);
	}

}
