package map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

	//Sorted , natural ordering is maintained
	
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(10, "ten");
		treeMap.put(12, "twelve");
		treeMap.put(1, "one");
		treeMap.put(5, "five");
		treeMap.put(8, "eight");
		
		//Will print values in sorted(ascending , by default) order on the key,integer
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
		TreeMap<Integer, String> treeMapd = new TreeMap<Integer, String>(Comparator.reverseOrder());
		
		treeMapd.put(10, "ten");
		treeMapd.put(12, "twelve");
		treeMapd.put(1, "one");
		treeMapd.put(5, "five");
		treeMapd.put(8, "eight");
		
		//Will print values in sorted descending(reverse) order on the key,integer
		System.out.println("-----------------------------");
		for(Map.Entry<Integer, String> entry : treeMapd.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
		System.out.println("Smallest Key : "+ treeMapd.lastKey());
		System.out.println("Greatest Key : "+ treeMapd.firstKey());
		
		
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("ten",10);
		map.put("twelve",12);
		map.put("one",1);
		map.put("five",5);
		map.put("eight",8);
		//map.put(null,8); // can not have null key , but can hv multiple null values
		map.put("any",null);
		map.put("anyNull",null);
		
		//Will print values in sorted dictionary order on the key,String
		System.out.println("-----------------------------");
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}
		
		System.out.println("Smallest Key : "+ map.firstKey());
		System.out.println("Greatest Key : "+ map.lastKey());
		
		System.out.println("-----------------------------");
		
		
		
		NavigableMap<Integer ,String> map1=new TreeMap<Integer ,String>();    
		map1.put(100,"Amit");    
		map1.put(102,"Ravi");    
		map1.put(101,"Vijay");    
		map1.put(103,"Rahul");    
	      //Maintains descending order  
	      System.out.println("descendingMap: "+map1.descendingMap());  
	      //Returns key-value pairs whose keys are less than or equal to the specified key.  
	      System.out.println("headMap: "+map1.headMap(102,true));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map1.tailMap(102,true));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map1.subMap(100, false, 102, true));   
		
	}

}
