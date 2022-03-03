package p2;


import p2.DoublyLinkedList.Node;

public class main {

	public static void main(String[] args) {
	
		DoublyLinkedList List= new DoublyLinkedList();
		
		List.append(0);
		List.append(1);
		List.append(2);
		List.append(3);
		List.append(4);
		Node alp = new Node(2);
		
		List.add(alp);
		
		
		List.print();
		System.out.println();
		System.out.println("Size is:"+List.GetSize());
		List.deleteatGiven(1);
		List.print();
		System.out.println();
		List.deleteNode(alp);
		List.print();
		System.out.println();
		List.Reverse();
		List.print();
		System.out.println();
	}

}
