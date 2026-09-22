package com.collection2;

import java.util.*;

/*
 * map  -- store data in key value pair
 *   HashMap        hashcode | random     |faster
 *   LinkedHashMap  insertion order       |slow
 *   TreeMap       Ascending order of Key |slowest 
 *   
 *  --map doesnot inherits Collection  
 *    in map keys must be unique
 *    
 *    Treemap doesnot allow null key but null value is allowed
 *    HashMap null key will be written in beginning 
 *    
 */
public class MapExample {
	public static void main(String[] args) {

		HashMap<Integer,String> r= new HashMap();
		//LinkedHashMap<Integer,String> r= new LinkedHashMap();
		//TreeMap<Integer,String> r= new TreeMap();
		r.put(12, "Ashu");
        r.put(22, "bina");
        r.put(43, "kamal");
        r.put(14, "deepak");
        r.put(54, "chetan");
        r.put(null, null);
        System.out.println(r);
       System.out.println(r.get(4));
       System.out.println(r.size());
       System.out.println(r.values());//in array form
   }}
