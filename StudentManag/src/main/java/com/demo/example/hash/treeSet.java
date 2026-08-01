package com.demo.example.hash;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1 = new Student1(10,"Cditi","Pune");

		Student1 s2 = new Student1(2,"Aditi","Pune");

		Student1 s3 = new Student1(3,"Baiti","Pune");
		
		Icomparator c = new Icomparator();
		
		Set set =new TreeSet(c);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
//		System.out.println(s2.compareTo(s1));
		
		System.out.println(set);


	}

}


class Icomparator implements Comparator<Student1>{


	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}


	
	
	
	
}

class Student1 {
//implements Comparable<Student1>{
	
	private int id;
	private String name;
	private String address;
	
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	public Student1(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
//	@Override
//	public int compareTo(Student1 o) {
//		
//		
//		return this.name.compareTo(o.getName());
		// Integer Comparison
//		if(this.id<o.getId())
//			return -1;
//		 if(this.id>o.getId())
//			 return 1;
//		 
//		return 0;
		
//		OR
		
//		return this.id-o.getId();
		
}

