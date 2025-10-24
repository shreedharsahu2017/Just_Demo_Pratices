package com.jsp.collectionframeworks;

import java.util.*;
import java.util.Map.Entry;
public class HashMapDemo {
    public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "rakesh");
		map.put(2, "rakesh");
		map.put(3, "vijay");
		map.put(4, "rohit");
		System.out.println(map);
		//hashcode
		System.out.println(map.hashCode());
		//isempty
		System.out.println(map.isEmpty());
		//containskey()
		System.out.println(map.containsKey(3));
		//keyset()
		System.out.println(map.keySet());
		//keyvalue
		System.out.println(map.values());
		//entryset
		System.out.println(map.entrySet());
		//getkey()
		System.out.println(map.get(3));
		if(map.containsKey(1)) {
			System.out.println(" map contains keys");
		}else {
			System.out.println("empty keys");
		}
		System.out.println(map.equals(map));
		System.out.println(map.size());
		System.out.println(map.containsValue("vijay"));
		System.out.println(map.keySet());
		//ele get one by one
		for(int i:map.keySet()) {
			System.out.println(i);
		}
		for(Object i:map.values()) {
			System.out.println(i);
		}
		
		for(Object i:map.keySet()) {
			System.out.println(i+"   "+map.get(i));
			System.out.println("after entry method");
		//Entry method
			for(Map.Entry<Integer,String> entry:map.entrySet()) {
				System.out.println(entry.getKey()+"  "+entry.getValue());
				System.out.println("iterator method");
			/*	Set s=map.entrySet();
				  Iterator itr=s.iterator();
				  while(itr.hasNext()) {
					  System.out.println(itr.next());*/
					  
					  
					  System.out.println("------------------------------");
					  
					  
					  Set s=map.entrySet();
					  Iterator itr=s.iterator();
					  while(itr.hasNext()) {
					Map.Entry entry1 = (Entry)itr.next();
					  System.out.println(entry1.getKey()+"  "+entry1.getValue());
			
		
		
		}
			}}}
}
