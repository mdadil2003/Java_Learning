package collection2;

import java.util.TreeSet;
//comparable interface  -> compareTo 
//comparator interface     Compare()

class Student implements Comparable<Student>
{ 
	int rollno ;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n [rollno=" + rollno + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		 
		return this.name.compareTo(o.name);
	}
	 
	
}
public class TreeMapExample {

	public static void main(String[] args) 
	{

		Student s1= new Student(12,"ajay");
		Student s2= new Student(11,"chetan");
		Student s3= new Student(16,"bina");
		Student s4= new Student(13,"neha");
		Student s5= new Student(17,"deepak");
		TreeSet<Student> t= new TreeSet();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		t.add(s4);
		t.add(s5);
	    System.out.println(t);	

	}

}
