package com.collection2;

import java.util.ArrayList;
import java.util.TreeSet;

//wap to ask employee details and store it in 
// TreeSet 

class Employee implements Comparable<Employee>
{
int empid;
String name;
public Employee(int empid, String name) {
	super();
	this.empid = empid;
	this.name = name;
}
@Override
public String toString() {
	return "\nEmployee [empid=" + empid + ", name=" + name + "]";
}
@Override
public int compareTo(Employee o) {
	 
	return Integer.compare(empid, o.empid);
}

}
public class EmployeeManagement 
{

	public static void main(String[] args) {
	
		Employee e= new Employee(11,"rajat");
		Employee e1= new Employee(212,"gagan");
		Employee e2= new Employee(12323,"ashu");
		Employee e3= new Employee(154,"riya");
		TreeSet<Employee> k= new TreeSet();
		k.add(e);
		k.add(e1);
		k.add(e2);
		k.add(e3);
		System.out.println(k);
		
		
		

	}

}
