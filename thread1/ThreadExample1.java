package thread1;

//multithreading
/*
 *  1 thread - 1 task 
 *  n thread  multithreading
 *  
 *  To perform multithreading 
 *  
 *  a) extends  Thread  class
 *  b) implements Runnable interface 
 *  
 *  every program has 1 thread - Main thread 
 *   --> main method
 *  c) housekeeping threads 
 *       
 */
//wap to display properties of thread 
//currently running

import java.lang.*;

public class ThreadExample1 {
	public static void main(String[] args) {
  
		Thread r= Thread.currentThread();
		System.out.println(r.getId());
		System.out.println(r.getName());
		//1 to 10 
		//main  -5 
		//min priority 1 
		//max priority 10
		System.out.println(r.getPriority());
		r.setName("Testing");
		r.setPriority(10);
		System.out.println(r.getName());
		System.out.println(r.getPriority());
		System.out.println(r.isAlive());//true
	}
}
