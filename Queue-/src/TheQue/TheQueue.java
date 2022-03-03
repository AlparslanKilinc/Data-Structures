package TheQue;

import java.util.Arrays;

public class TheQueue {

private String[] queueArray; 
	
	private int queueSize;
	
	private int front , rear , numberofItems=0;
	
	TheQueue(int size){
		
		queueSize= size; 
		queueArray= new String[size]; 
		Arrays.fill(queueArray,"-1");
	}
	
	

	
	public void insert(String input) {
		
		if(numberofItems+1 <= queueSize) {
			
			queueArray[rear]=input;
			rear++;
			numberofItems++;
			
			System.out.println(" INSERT"+ input +"Was Added to the Queue");
			
		}else {
			System.out.println("Queue is Full");
		}
	}
	
	public void priorityInsert(String input) {
		int i;
		if(numberofItems==0) {
			insert(input);
		}
		else {
			for(i =numberofItems-1; i>=0; i--) {
				if(Integer.parseInt(input)>Integer.parseInt(queueArray[i])) {
					 queueArray[i+1]=queueArray[i];
				}else break;
			}
			queueArray[i+1]=input;
			rear++;
			numberofItems++; 
		}
		
	}
	
	public void display() {
		
		for(int i=0; i<numberofItems; i++) {
			System.out.println(queueArray[i]);
		}
	}
	
	
	public void remove() {
		if(numberofItems >0 ) {
			System.out.println("Remove"+queueArray[front]+ " Was removed");
			queueArray[front]=queueArray[front+1];
			front++;
			numberofItems--;
		}
		else {
			 System.out.println("Queue is Empty");
		}
	}
	
	public void peek() {
		System.out.println(" the first Element is"+ queueArray[front]);
	}
}
