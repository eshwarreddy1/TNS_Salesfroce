package com.tns.day3;

import java.util.Scanner;
public class persondemo{

	public static void main(String[] args) {
		person obj = new person();
		String name,gender;
		int income,age,tax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter gender:");
		gender=sc.next();
		System.out.println("Enter income:");
		income=sc.nextInt();
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("Enter tax:");
		tax=sc.nextInt();
		obj.setName(name);
		obj.setGender(gender);
		obj.setIncome(income);
		obj.setAge(age);
		obj.setTax(tax);
		System.out.println(obj);
		

	}

}
