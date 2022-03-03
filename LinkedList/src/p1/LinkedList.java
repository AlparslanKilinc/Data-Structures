package p1;



public class LinkedList {
	Node head;
	
	/// Reverse 
	
	public Node Reverse(Node head) {
		
		Node next=null;
		Node prev=null;
		Node curr=head;
		/// Empty list return
		
		
			while(curr!=null) {
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			return prev;
			
	}

	//// Get Size 
	
	public int GetSize() {
		Node node=head;
		int count =0;
		while(node!=null) {
			node=node.next;
			count++;
		}
		
		return count;
	}
	
	/////// Search 
	
	public int GetValueatIndex(int index) {
		
		Node node = head;
		int count =0;
		
		while(node!=null) {
			if(count==index) {
				System.out.println(node.data);
				return node.data;
			}
			count++;
			node=node.next;
		}
			System.out.println("index not found return value is 0");
		return 0;
		
	}
	
	//// Deletion 
	
	/// According to data 
	public void deleteNode(int key) {
		Node node=head;
		/// keep track of the node before the one to be deleted
		Node prev=null;
		
		if(node!=null && node.data==key) {
			head=node.next;
			return;
		}
		
		while(node!=null&& node.data!=key) {
			prev=node;
			node=node.next;
		}
		if(node==null) {
			System.out.println("Given data of the Node is not in the linked List");
			return;
		}
			///// prev holds the value right before of the node to be deleted
			///// so prev.next is the node to be delted
			///// if we make that node  the next of node to be delted we will be complete.
			prev.next=node.next;
	}
	//// According to position 
	public void deletePos(int pos) {
		Node node=head;
		Node prev=null;
		
		if(node==null) {
			return;
		}
		if(pos==0) {
			head=node.next;
			return;
		}
		
		
		/// get prev position
		prev=node;
		for(int i=0; i<pos-1; i++) {
			 prev=prev.next;
		}
		if(prev==null || prev.next==null) {
			System.out.println("Entered Position is not in the List");
			return;
		}
			node=prev.next;
			prev.next=node.next;
		
		
	}
	

	
	/// Insertion 
	
	///at Head
	public void push(int newdata) {
		Node NewData =new Node(newdata);
		NewData.next=head;
		head=NewData;
	}
	/// After giving Node 
	public void InsertAfter(Node prev,int newdata) {
		if(prev==null) {
			System.out.println("Given Node is Null");
			return;
		}
		Node newData = new Node(newdata);
		newData.next=prev.next;
		prev.next=newData;
	}
	//// At the End 
	public void append(int newdata) {
		Node newNode= new Node(newdata);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=null;
		
		/// get to the last null 
		/// make new node so the head doesnt change 
		Node last = head;
		while(last.next!=null) {
			last=last.next;
		}
			last.next=newNode;
			return;

	}
	
	/// Printing
	public void print() {
		Node node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node=node.next;
			
		}
		
	}

	

	
	/// Node Class
	public static  class Node {
		int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data=data;
		}

		public Node() {
		
		}
		
	}
	
}
	