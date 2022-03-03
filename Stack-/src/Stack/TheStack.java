package Stack;

import java.util.Arrays;

public class TheStack {
	
private String[] stackArray;
	
	private int stackSize;
	
	private int topOfStack=-1;
	
	TheStack(int size){
		stackSize=size;
		stackArray=new String[size];
		
		Arrays.fill(stackArray, "-1");
	}
	
	public int size() {
		return stackSize;
	}
	
	public boolean full() {
		boolean isfull=false;
		
		if(topOfStack==stackSize) isfull=true;
		
			return isfull;
	}
	
	public void displayAll() {
		for(int i=topOfStack; i>=0; i--) {
			System.out.print(stackArray[i]+ " | ");
		}
	}
	
	public void push(String input) {
		
		if(topOfStack+1<stackSize) {
			topOfStack++;
			stackArray[topOfStack]=input;
		} else System.out.println("Stack is full");
	
		System.out.println("Push  "+ input +"   was added to the Stack");
	}
	
	public  String pop() {
		
		if(topOfStack>=0) {
			System.out.println("POP  "+stackArray[topOfStack]+"   Was Removed from the Stack");
			stackArray[topOfStack]="-1";
			return stackArray[topOfStack--];
		}
		else {
			System.out.println("Stack is Empty");
			return "-1";
		}
	}
	
	public String peek() {
		
		if(topOfStack>=0) {
			return stackArray[topOfStack];
		}else return "Stack is Empty";
	}
	
}
