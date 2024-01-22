package com.tns.day3;

import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		String name,dept;
		int id,age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name=sc.next();
		System.out.println("Enter dept:");
		dept=sc.next();
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter age:");
		age=sc.nextInt();
		emp.setName(name);
		emp.setDept(dept);
		emp.setId(id);
		emp.setAge(age);
		System.out.println(emp);
		

	}

}
