package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapVsTreeMapPerformance {

	public static void main(String[] args) {
		
		long now;
		
		Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
		
		now = System.currentTimeMillis();
		
		for(int i =0 ;i<500000;i++) {
			treeMap.put(i, i);
		}
		for(int i =0 ;i<500000;i++) {
			treeMap.get(i);
		}
		
		System.out.println("Time Taken by TreeMap : "+( System.currentTimeMillis()- now));
		
		Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		
		now = System.currentTimeMillis();
		
		for(int i =0 ;i<500000;i++) {
			hashmap.put(i, i);
		}
		for(int i =0 ;i<500000;i++) {
			hashmap.get(i);
		}
		
		System.out.println("Time Taken by HashMap : "+( System.currentTimeMillis()- now));
		
		
	}
	

}
