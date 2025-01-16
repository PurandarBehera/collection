package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {
	
	//Insertion Order is  maintained

	public static void main(String[] args) {
		
		Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put(1, "Purandar");
		linkedHashMap.put(2, "Sunil");
		linkedHashMap.put(3, "Milan");
		linkedHashMap.put(4, "Anu");
		linkedHashMap.put(5, "Aniruddha");
		linkedHashMap.put(6, "Neha");
		linkedHashMap.put(8, "Pavan");
		linkedHashMap.put(9, "Madhavi");
		linkedHashMap.put(10, "Madhan");
		linkedHashMap.put(11, "Kush");
		linkedHashMap.put(12, "Lopa");
		linkedHashMap.put(13, "Kartik");
		linkedHashMap.put(14, "Nitin");
		linkedHashMap.put(15, null);
		linkedHashMap.put(16, null); //Multiple null can be stored
		linkedHashMap.put(null, null);
		linkedHashMap.put(null, "abc"); //We cannot store duplicate keys (null in this case ) in linkedHashMap. 
		//However, if we try to store a duplicate key with another value, it will replace the value.
		
		
		
		System.out.println(linkedHashMap.get(5));
		System.out.println(linkedHashMap.get(16));
		System.out.println(linkedHashMap.get(null)); //Only one null key is allowed -- so abc will be printed
		
		System.out.println("------------------------------------------");
		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(linkedHashMap.get(key));
		}
		
		System.out.println("------------------------------------------");
		for (Entry<Integer, String> entryKeyValue : linkedHashMap.entrySet()) {
			System.out.println(entryKeyValue.getKey() +" : "+ entryKeyValue.getValue());
		}
		
		System.out.println("------------------------------------------");
		
		for (String value : linkedHashMap.values()) {
			System.out.println(value);
		}
	}

}
