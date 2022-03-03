package TheQue;

public class GenericQueue<T1> {

	private T1[] data;
	   private int size;
	   private int numOfNodes;
	   private int front;
	   private int rear;
	   public GenericQueue()
	  {  size = 100;
	      numOfNodes = 0;
	      front = 0;
	      rear = 0;
	      data = (T1[])new Object[100];
	   }
	   public GenericQueue(int n)
	  {  size = n;
	      numOfNodes = 0;
	      front = 0;
	      rear = 0;
	     data = (T1[]) new Object[n];
	   }
	   public void initialize(){
	       numOfNodes = 0;
	      front = 0;
	      rear = 0;
	   }
	   public boolean enque(T1 newNode)
	  {  if(numOfNodes >= size){
	         boolean expand = expand();
	         if(expand==false){
	          return false;   
	         }
	  }
	        Cloneable node = (Cloneable) newNode;
	        numOfNodes = numOfNodes +1;
	         data[rear] = (T1) node.deepCopy();
	         rear = (rear +1) % size;
	         return true;  // push operation successful
	      
	  }
	   public T1 deque( )
	   {  int frontLocation;
	       if(numOfNodes == 0)
	          return null;  // ** underflow error **
	       else
	       { frontLocation = front;
	          front = (front + 1) % size;
	          numOfNodes = numOfNodes -1;
	          return data[frontLocation];
	       }
	   }
	   public boolean isEmpty(){
	       if(numOfNodes==0) 
	           return true;
	       else return false;
	   }
	   public boolean isFull(){
	       if(numOfNodes==size) 
	           return true;
	       else return false;
	   }
	   public T1 peek(){
	       Cloneable node = (Cloneable) data[front];
	       if(numOfNodes==0)
	           return null;
	       else{
	           return (T1) node.deepCopy();
	       }
	      
	   }
	           
	   public void showAll()
	   {   int i = front;
	       for(int c = 1; c <= numOfNodes; c++)
	       {  System.out.println(data[i].toString( ));
	           i = (i + 1) % size;
	       }
	   }
	   private boolean expand(){
	       int index = front;
	       T1[] temp = data;
	       data = (T1[]) new Object[size*2];
	       if(data==null)
	        {
	           data=temp;
	            return false;
	        }
	       /// copy the array
	       for(int i=0; i<numOfNodes; i++){
	           data[i]= temp[index];
	           index = (index+1)% size;
	           
	       }
	       front=0;
	       rear=size;
	       size=size*2;
	        return true;
	   }
}
