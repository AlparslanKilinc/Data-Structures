import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T extends Comparable<T>> {
	
	public class Node{
		T data;
		Node left;
		Node right;

		public Node(Node left, Node right , T data) {
			this.data = data;
			this.left=left;
			this.right=right;
		}
		
	}
	/// Variables
	private Node root=null;
	private int nodeCount=0;
	
	
	
	/// Constructors
	public BinaryTree() {
		
	}
	
	public BinaryTree(int nodeCount, BinaryTree<T>.Node root) {
		super();
		this.nodeCount=nodeCount;
		this.root=root;
	}
	
	/// Getter and Setters

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(int nodeCount) {
		this.nodeCount = nodeCount;
	}
	
	/// Methods 
	
	public int size() {
		return nodeCount;
	}
	public boolean isEmpty() {
		
		return size()==0 ;
	}
	
	/// MIN AND MAX
	public Node findMin(Node root) {
		while(root.left !=null) {
			root=root.left;
		}
		return root;
	}
	public Node findMax(Node root) {
		while(root.right !=null) {
			root=root.right;
		}
		return root;
	}
	//// Find height of the tree
	
	public int getheight() {
		return height(root);
	}
	
	private int height(Node root) {
		if(root==null)return 0;
		
		return Math.max(height(root.left), height(root.right))+1;
	}
	//////// TRAVERSALS 
	public void Inorder(Node root) {
		if(root==null) return;
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
		
	}
	public void PostOrder(Node root) {
		if(root==null) return;
		PostOrder(root.left);
		PostOrder(root.right);
		System.out.print(root.data+" ");
	}
	public void preorder(Node root) {
		if(root==null) return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	 //// LEVEL ORDER TRAVERSAL
	public void LOTrav(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp= q.peek();
			System.out.print(temp.data+" ");
			q.remove();
			if(temp.left!=null) {
				q.add(temp.left);
			}
			if(temp.right!=null) {
				q.add(temp.right);
			}
		}
	}
	
	
	
	
	///// CONTAINS SEARCH 
	private boolean contains(Node root , T data) {
		if(root==null) return false;
		
		int x = data.compareTo(root.data);
		
		if(x<0) return contains(root.left,data);
		else if (x>0) return contains(root.right,data);
		else return true;
		
	}
	public boolean contains(T data) {
		return contains(root,data);
	}
	
	
	
	
	/// INSERTION
	public boolean add(T data) {
		if(contains(data)) {
			return false;
		}else {
			root= add(root,data);
			nodeCount++;
			return true;
		}
		
	}
	
	private Node add(Node node, T data) {
		if(node == null) {
			node = new Node(null,null,data);
		} else {
			if(data.compareTo(node.data)<0) {
				node.left = add(node.left,data);
			}else {
				node.right = add(node.right, data);
			}
		}
		return node;
		
	}
	
	//// Deletion 
	public boolean remove(T data) {
		if(contains(data)) {
			root=remove(root,data);
			nodeCount--;
			return true;
		}
		return false;
	}
	private Node remove (Node node , T data) {
		if(node ==null) return null;
		
		int x = data.compareTo(node.data);
		
		if(x<0) {
			node.left = remove(node.left,data);
			
		} else if(x>0) {
			node.right= remove(node.right,data);
		}else {
			
			if(node.left==null) {
				Node rightChild = node.right;
				node.data=null;
				node=null;
				return rightChild;
			} else if (node.right==null) {
				Node leftChild = node.left;
				node.data = null;
				node = null;
				return leftChild;
			}else {
				Node temp= findMin(node.right);
				node.data=temp.data;
				node.right = remove(node.right,temp.data);
			}
		}
		return node;
			
	}
	
	
	

	
	
	
	
	
}
