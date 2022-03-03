package p2;

import p1.LinkedList.Node;

public class DoublyLinkedList {
	Node head;
	
	/// Reverse 
	
	
	public void Reverse() {
		
		Node temp=null;
		Node curr=head;
		/// Empty list return
		
		
			while(curr!=null) {
				temp=curr.prev;
				curr.prev=curr.next;
				curr.next=temp;
				curr=curr.prev;
				
			}
			if(temp!=null) {
				head=temp.prev;
			}
				
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
		public void deleteNode(Node del) {
			 if (head == null || del == null) {
		            return;
		        }
			 if(head==del) {
				 head=del.next;
			 }
			 if(del.next!=null) {
				 del.next.prev=del.prev;
			 }
			 if(del.prev!=null) {
				 del.prev.next=del.next;
			 }
			 return;
			 
		}
		public void deleteatGiven(int pos) {
			
			Node curr=head;
			if (head == null|| pos<0) {
	            return;
	        }
			if(pos==0) {
				head=head.next;
			}
			
			for(int i=0; curr!=null&& i<pos; i++) {
				curr=curr.next;
				
			}
			if(curr==null) {
				return;
			}
			deleteNode(curr);
			
			
		}


	/// Insertion 
	
	///at Head
	public void pushatHead(int newdata) {
		Node NewData =new Node(newdata);
		NewData.next=head;
		if(head!=null) {
			head.prev=NewData;
		}
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
		newData.prev=prev;
		if(newData.next!=null) {
			newData.next.prev=newData;
		}
	}
	//// At the End 
	public void append(int newdata) {
		Node newNode= new Node(newdata);
		if(head==null) {
			newNode.prev=null;
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
			newNode.prev=last;

	}
	public void add(Node node) {
		if(head==null) {
			node.prev=null;
			head=node;
			return;
		}
		Node curr = head;
		while(curr.next!=null){
			curr=curr.next;
		}
		curr.next=node;
		node.prev=curr;
		
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
		
		Node(int data){
			this.data=data;
		}

		public Node() {
		
		}
		
	}




	
}
