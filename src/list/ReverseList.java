package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {

		List<Integer> arrList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20));

		List<Integer> reverselist = new ArrayList<Integer>();

		for (int i = arrList.size()-1; i >= 0; i--) {
			reverselist.add(arrList.get(i));
		}
		System.out.println(reverselist);
	}

}
