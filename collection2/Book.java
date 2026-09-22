package collection2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Book // implements Comparable<Book>
{
	String bname;
	int price;
	
   public Book(String bname, int price) {
		super();
		this.bname = bname;
		this.price = price;
	}

@Override
	public String toString() {
		return "\n bname=" + bname + ", price=" + price + "]";
	}


	public static void main(String[] args) {

		Book b= new Book("java",350);
		Book b1= new Book("C++",300);
		Book b2= new Book("pascal",200);
		Book b3= new Book("database",230);
		
		
   PriorityQueue<Book> p= new PriorityQueue(new compareByName());
   p.add(b);// add will call compareTo method
   p.add(b1);
   p.add(b2);
   p.add(b3);
   
   System.out.println(p.poll());
   System.out.println(p.poll());
	}

//	@Override
//	public int compareTo(Book o) {
//		 
//		return Integer.compare(this.price, o.price);
//	}

}

class compareByName implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2) {
		 
		return o1.bname.compareTo(o2.bname);
	}
	
}