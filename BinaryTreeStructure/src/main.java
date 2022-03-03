



public class main  {

	public static void main(String[] args) {
		
	

		BinaryTree<Integer> t = new BinaryTree<Integer>();
		
			t.add(15);
			t.add(10);
			t.add(20);
			
			t.add(8);
			t.add(12);
			t.add(17);
			t.add(25);
			
			
			System.out.print("InOrder:");
			t.Inorder(t.getRoot());
			t.remove(8);
			System.out.println();
			t.Inorder(t.getRoot());
		
			
		

	}

}
