package com.velocity.MapDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap <Integer,String> map=new HashMap <Integer,String>();
		map.put(1, "ram");
		map.put(2, "Nik");
		map.put(3, "ram");
		
		Set <Integer> k=map.keySet();
		
		for(int i:k)
		{
			System.out.println("key is:" +i);
			
			System.out.println("value is:" +map.get(i));
			
		}
		
		

	}

}
