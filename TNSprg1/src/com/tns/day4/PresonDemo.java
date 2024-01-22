package com.tns.day4;

import java.util.Scanner;

public class PresonDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,city;
		int age;
		System.out.println("Enter the preson details");
		name=sc.nextLine();
		city=sc.nextLine();
		age=sc.nextInt();
		Preson  obj=new Preson();
		obj.setName(name);
		obj.setCity(city);
		obj.setAge(age);
		System.out.println(obj);
		

	}

}
