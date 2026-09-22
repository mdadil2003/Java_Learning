package com.collection2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample3 {

	public static void main(String[] args) {
		
		HashMap <Integer,String>r= new HashMap();
		r.put(1,"java");
		r.put(2,"c++");
		r.put(3,"database");
		r.put(4,"webtech");
	    System.out.println(r);
		// map doesnot inherit collection and iterator
	    // map does not iterator method
	   //print 
		Collection c=r.values();
		Iterator i=c.iterator();
		while(i.hasNext())
		{ 
		 	System.out.println(i.next());
		}
	// extract key and value both 
	   Set s= r.entrySet();
	   Iterator h= s.iterator();
	   while(h.hasNext())
	   {
	 	Map.Entry h2= (Map.Entry)h.next();
		System.out.println(h2.getKey()+ " **  "+ h2.getValue());
	   }}
	
		
	}
	

 