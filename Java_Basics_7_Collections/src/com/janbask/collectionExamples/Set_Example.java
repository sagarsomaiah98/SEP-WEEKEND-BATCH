package com.janbask.collectionExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<String> names= new HashSet<String>();
		names.add("Mark");
		names.add("Steve");
		names.add("Joe");
		names.add("MaRk");
		names.add("steve");
		
		
		//System.out.println(names.size());
		
		Iterator<String> itr= names.iterator();
		
		/*
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 * System.out.println(itr.next()); System.out.println(itr.hasNext());
		 */
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
