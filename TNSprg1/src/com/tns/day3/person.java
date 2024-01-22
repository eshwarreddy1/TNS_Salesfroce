package com.tns.day3;

public class person {
	private String Name;
	private int income;
	private String Gender;
	private int age;
	private int tax;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "person [Name=" + Name + ", income=" + income + ", Gender=" + Gender + ", age=" + age + ", tax=" + tax
				+ "]";
	}
	
}
