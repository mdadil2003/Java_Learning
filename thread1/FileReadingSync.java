package thread1;

import java.io.*;
class FileRead {
	synchronized  void read(String fname)
	{
	int i;
	try {
	FileReader r= new FileReader(fname);
    do {
		i= r.read();
    	System.out.print((char)i);
    	Thread.sleep(1000);
    } while(i!=-1);
    	
    }catch(Exception r) {}
	}
}
public class FileReadingSync extends Thread {

	FileRead e;
	String fname;
	FileReadingSync(FileRead y,String filename)
	{ 
		e= y;
		fname= filename;
	}
	public void run()
	{
		try {  //synchronized
			e.read(fname);
			
		}catch(Exception r) {}
	}
	public static void main(String[] args) {
		FileRead x= new FileRead();
		FileReadingSync s= new FileReadingSync(x,"src/thread1/one.txt");
		FileReadingSync s1= new FileReadingSync(x,"src/thread1/two.txt");
		FileReadingSync s2= new FileReadingSync(x,"src/thread1/three.txt");
		s.start();
		s1.start();
		s2.start();
	}
}
