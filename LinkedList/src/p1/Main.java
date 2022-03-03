package p1;

import p1.LinkedList.Node;

public class Main {

	public static void main(String[] args) {
		
		LinkedList List= new LinkedList();
		
		List.head=new Node(3);
		Node third= new Node(4);
		List.head.next= third;
		third.next=new Node(5);
		
		
		List.print();
		List.deletePos(2);
		System.out.println();
		List.print();
		System.out.println();
		System.out.println("Size is:"+List.GetSize());
		List.GetValueatIndex(1);
		
		List.head=List.Reverse(List.head);
		
		List.print();

	}

}
