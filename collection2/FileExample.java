package collection2;

import java.io.*;
// see properties of file -->File
public class FileExample {

	public static void main(String[] args) {
		 
		File r= new File("Record.txt");
		File k[]= r.listFiles();
		System.out.println(r.length());
		System.out.println(r.isDirectory());
		System.out.println(r.isFile());//
		System.out.println(r.exists()); //true

 
		File p= new File("one");
		p.mkdir();
		
		File p1= new File("two\\abc\\xyz");
		p1.mkdirs();
		
		System.out.println(r.lastModified());
	 
		
	}

}
