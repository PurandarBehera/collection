package list.linkedlist;

public class Test {

	public static void main(String[] args) {

		CustomLinkedList linkedList = new CustomLinkedList();
		linkedList.insertFirst(3);
		linkedList.insertFirst(8);
		linkedList.insertFirst(12);
		linkedList.insertFirst(9);
		linkedList.insertFirst(17);

		linkedList.insertLast(33);

		linkedList.insert(200, 3);

		linkedList.display();

	}

}
