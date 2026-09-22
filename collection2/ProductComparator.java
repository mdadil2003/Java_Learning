package collection2;

import java.util.Comparator;
import java.util.TreeSet;

class Product
{
	int pid;
	String pname;
	public Product(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "\n [pid=" + pid + ", pname=" + pname + "]";
	}
	
}
class productcompareByName implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		 
		return o1.pname.compareTo(o2.pname);
	}
	
}

class productcompareById implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		 
		return Integer.compare(o1.pid, o2.pid);
	}
	
}

public class ProductComparator {

	public static void main(String[] args) {
	
		Product p= new Product(234,"monitor");
		Product p1= new Product(134,"keyboard");
		Product p2= new Product(254,"mouse");
		Product p3= new Product(2804,"CPU");
		TreeSet<Product> s= new TreeSet(new productcompareByName());
		s.add(p);
		s.add(p1);
		s.add(p2);
		s.add(p3);
		System.out.println(s);
		
	}

}
