package com.Demo_1;

public class Demo {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		
		teacher.setName("data");
		System.out.println(teacher.getName());
		
		teacher.setAge(20);
		System.out.println(teacher.getAge());
	
		Student st = new Student();
		st.setProvince("kompong cham");
		System.out.println(st.getProvince());
	}

}
