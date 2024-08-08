package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(8);
		arrayList.add(76);
		arrayList.add(98);
		arrayList.add(82);
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =10 ; i<=100; i=i+10) {
			list.add(i);
		}
		
		System.out.println("List:"+list);
		
		list.add(2, 25);
		System.out.println("List after Insert :"+list);
		
		list.set(5, 88);
		System.out.println("List after Replace :"+list);
		
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		
		System.out.println("SecondList: "+secondList);
		
		list.addAll(1, secondList);
		System.out.println("List after Adding SecondList : "+list);
		
		if(list.contains(456)) {
			System.out.println("List has the object");
		}else
			System.out.println("List does not have the object");
		
	}

}
