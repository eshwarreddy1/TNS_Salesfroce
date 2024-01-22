package com.tns.day4;

public class Preson {
	private String name;
	private String city;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Preson() {
		
	}
	public Preson(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Preson [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
	

}
