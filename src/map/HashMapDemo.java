package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	//insertion Order is not maintained

	public static void main(String[] args) {
		
		Map<Integer,String> hashMap = new HashMap<>();
		
		hashMap.put(1, "Purandar");
		hashMap.put(2, "Sunil");
		hashMap.put(3, "Milan");
		hashMap.put(4, "Anu");
		hashMap.put(5, "Aniruddha");
		hashMap.put(6, "Neha");
		hashMap.put(8, "Pavan");
		hashMap.put(9, "Madhavi");
		hashMap.put(10, "Madhan");
		hashMap.put(11, "Kush");
		hashMap.put(12, "Lopa");
		hashMap.put(13, "Kartik");
		hashMap.put(14, "Nitin");
		hashMap.put(15, null);
		hashMap.put(16, null); //Multiple null can be stored
		hashMap.put(null, null);
		hashMap.put(null, "abc"); //We cannot store duplicate keys (null in this case ) in HashMap. 
		//However, if we try to store a duplicate key with another value, it will replace the value.
		
		
		
		System.out.println(hashMap.get(5));
		System.out.println(hashMap.get(16));
		System.out.println(hashMap.get(null)); //Only one null key is allowed -- so abc will be printed
		
		System.out.println("------------------------------------------");
		for (Integer key : hashMap.keySet()) {
			System.out.println(hashMap.get(key));
		}
		
		System.out.println("------------------------------------------");
		for (Entry<Integer, String> entryKeyValue : hashMap.entrySet()) {
			System.out.println(entryKeyValue.getKey() +" : "+ entryKeyValue.getValue());
		}
		
		System.out.println("------------------------------------------");
		
		for (String value : hashMap.values()) {
			System.out.println(value);
		}
	}

}
