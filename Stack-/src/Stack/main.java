package Stack;

public class main {

	public static void main(String[] args) {
		TheStack stack = new TheStack(10);
		 
		stack.push("alp");
		stack.push("a");
		stack.push("al");
		stack.push("ap");
		
		stack.displayAll();

	}

}
