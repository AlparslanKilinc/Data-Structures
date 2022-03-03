package TheQue;

public class main {

	public static void main(String[] args) {
		

		TheQueue queue = new TheQueue(10);
		
		
			queue.priorityInsert("5");
			queue.priorityInsert("7");
			queue.priorityInsert("10");
			queue.priorityInsert("2");
			queue.priorityInsert("6");
			queue.priorityInsert("13");
		
		queue.peek();
		queue.remove();
		queue.peek();


	}

}
