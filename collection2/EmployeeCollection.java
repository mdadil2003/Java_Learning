package collection2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

//custom classes 
class Emp
{
	int empid;
	String name;
	String address;
	
	public Emp(int empid, String name, String address) {
		super();
		this.empid = empid;
		this.name = name;
		this.address = address;
	}
	//annotation 
	@Override
	public String toString() {
		return "\n [empid=" + empid + ", name=" + name + ", address=" + address + "]";
	}
	
}

public class EmployeeCollection {

	public static void main(String[] args) {
		
		Emp r= new Emp(12,"gagan","delhi");
		Emp r1= new Emp(13,"riya","faridabad");
		Emp r2= new Emp(14,"ena","mumbai");
		Emp r3= new Emp(15,"ashu","N.delhi");
		Emp r4= new Emp(16,"divya","delhi");
		HashSet<Emp> h= new HashSet<Emp>();
		//LinkedList <Emp>h= new LinkedList();
		//TreeSet <Emp>h = new TreeSet();
		//ClassCastException
		h.add(r);
		h.add(r1);
		h.add(r2);
		h.add(r3);
		h.add(r4);
		h.add(r4);
		h.add(r4);
		System.out.println(h);
		
		for(Emp e1: h)
			System.out.println(e1);
		
	}

}
