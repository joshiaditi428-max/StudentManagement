package com.demo.example.hash;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashCode {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Babu","Amt");
		Employee e2 = new Employee("abu","Amt");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
	

		Set s = new TreeSet();
		
		s.add(e1);
		s.add(e2);
		System.out.println(s);
//		System.out.println(e1.equals(e2));
	}

}

class Employee{
	
	private String name;
	private String address;
	
	
public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	
	if(this==obj) {
		return true;
	}
	
	if(obj instanceof Employee) {
	Employee e2 = (Employee)obj;
	
	if(this.getName()==e2.getName()) {
		
		if(this.address==e2.getAddress()) {
			return true;
		}
		
		return false;
	}
	}
	
	return false;
}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	
	
	@Override
public String toString() {
	return "Employee [name=" + name + ", address=" + address + "]";
}

	public Employee(String name,String address) {
		
		this.name =name;
		this.address =address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}