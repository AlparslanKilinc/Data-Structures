package TheQue;

import java.util.NoSuchElementException;

public class CircularQueue {
	
	 private int front;
	    private int rear;
	    private int size;
	    private int nodes;
	    private int[] data;

	    public CircularQueue(int size) {
	        front=-1;
	        rear=-1;
	        nodes=0;
	        this.size = size;
	        data= new int[size];
	    }
	    public void enqueue(int info){
	        if(isFull())
	        resize();
	        else if(isEmpty())
	        front++;
	                
	        rear=(rear+1)%data.length;
	        data[rear]=info;
	                    }


	public int dequeue(){
	if(isEmpty())
	throw new NoSuchElementException();
	int temp= data[front];
	if(front==rear)
	front=rear=-1;
	else 
	front=(front+1)%data.length;
	return temp;
	}


	 public int peek(){
	if(isEmpty())
	throw new NoSuchElementException();
	System.out.println(data[front]);
	return data[front];
	}


	public boolean isEmpty(){
	return front==-1;
	}

	public boolean isFull(){
	return (rear+1)%data.length==front;
	}

	 private void resize() {
	int[] tempArr = new int[data.length*2];
	int i=0;
	int j =front;

	do{
	 tempArr[i++] = data[j];
	    j=(j+1)%data.length;

	}while (j!=front);

	front=0;
	rear=data.length;
	data=tempArr;
	}
}
