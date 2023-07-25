package com.velocity.MapDemo;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

TreeMap<String,String> treeMap=new TreeMap<String,String>();
treeMap.put("10" ,"Niki");
treeMap.put("50" ,"Nisha");
treeMap.put("20" ,"Nidhi");
treeMap.put("20","nj");
treeMap.put("50", "mj");



//System.out.println(treeMap);


Set<String> s=treeMap.keySet();		
		
for(String t:s)
{
	System.out.println("key =" +t);
	System.out.println("value ="+treeMap.get(t));
	
}
	}

}
