package com.velocity.MapDemo;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> maplist=new LinkedHashMap<Integer,String>();
		
		maplist.put(11, "dev");
		maplist.put(16, "dev");
		maplist.put(12, "Ajay");
		maplist.put(13, "kajol");
		maplist.put(15, null);
		maplist.put(14, "Rani");
		
		maplist.put(18, "Virat");
		
		//System.out.println(maplist);
		
		Set<Integer> mp=maplist.keySet();
		Iterator<Integer> itr =mp.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println("Key is:" +i);
			System.out.println("Value is:" +maplist.get(i));
			
		}
		

	}

}
