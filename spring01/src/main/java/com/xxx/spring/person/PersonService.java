package com.xxx.spring.person;

public class PersonService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void info(){
		System.out.println("此人的名字为：    "+name);
	}
}
