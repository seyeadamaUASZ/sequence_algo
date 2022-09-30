package binarysearchtree;

public class BinaryTree {
  private Node root;
  
  public BinaryTree() {
	// TODO Auto-generated constructor stub
	  root=null;
}
  
  public BinaryTree(int key) {
		// TODO Auto-generated constructor stub
		  root=new Node(key);
	}
  
  public static void main(String[] args) {
	BinaryTree tree = new BinaryTree();
	
	tree.root = new Node(1);
	
	/*
	  1
	 /  \
	null null
	   
	 */
	
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	
	/*
	  1
	 /  \
	 2   3
	/  \  /  \ 
  null null null null
	   
	 */
  tree.root.left.left = new Node(4);
  tree.root.right.right = new Node(5);
  
  /*
  1
 /  \
 2   3
/  \  /  \ 
4   5 null null
/   \
null null 
   
 */
  System.out.println("binary tree");
}
  
}
