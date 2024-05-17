
/* Tree creation using PreOrder traversal 

	steps of creating tree 

	1) the first element will always be root
	2) left part will be always created of each node
	3) if left part child node is null then right part will be created 

	Note ==> Here null is denoted by -1 

*/

// class to create Node for tree

import java.util.Queue;
import java.util.LinkedList;
class Node{

	int data;
	Node left;
	Node right;
	Node(int data){

		this.data = data;
		this.left = null;
		this.right=null;

		}
	}


// class to create Binary tree
class BinaryTree{
		static int indx = -1;
		
		public static Node buildTree(int nodes[]){
			indx ++;

			if(nodes[indx] == -1){
				return null;
			}

			Node newNode = new Node(nodes[indx]);
			newNode.left = buildTree(nodes); // left part creation using recursive call
			newNode.right = buildTree(nodes); // right part creation using recursive call
			
			return newNode;

		}
}

// main class where the flow of program starts

public class _01_Tree{

	/* In preOrder first root --> left --> right part is printed of a tree*/

	public static void printPreOrder(Node root){

		// base case 
		if(root == null){
			// System.out.print(-1+" ");  // -1 denotes null 
			return;
		}

		// print root
		System.out.print(root.data+" ");
		printPreOrder(root.left);  // print left
		printPreOrder(root.right); // print right


	}

	/* In Inorder first left --> root --> right  part is printed of a tree */
	public static void printInorder(Node root){

		if(root ==null){
			return;
		}
		
		printInorder(root.left);  // call for left part
		System.out.print(root.data+" "); // print root
		printInorder(root.right);  // call for right part
	}


	/* In Postorder first left --> right --> root part is printed of a tree */

	public static void printPostorder(Node root){

		// base case 

		if(root == null){
			return ;
		}

		printPostorder(root.left);
		printPostorder(root.right);
		System.out.print(root.data+" ");
	}

	/*The Level Order method is used to print the tree in BFS manner. This uses an queue to perfom actions*/
	public static void printLevelOrder(Node root){

		if(root==null){
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty()){

			Node currNode = queue.remove();
			if(currNode == null){
				System.out.println();
				if(queue.isEmpty()){

					break;
				}
				else{
					queue.add(null);
				}
			}
			else{

				System.out.print(currNode.data+" ");
				if(currNode.left != null){
					queue.add(currNode.left);
				}
				if(currNode.right != null){
					queue.add(currNode.right);
				}
			}
		}

	}

	public static void main(String args[]){

		int nodes[] = {1,2,5,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree = new BinaryTree();
		Node root = tree.buildTree(nodes);
		
		/* Note ==> Preorder, Postorder, Inorder are DFS search */

		System.out.print("Preorder printing of tree --> ");
	    printPreOrder(root);
	    System.out.println();

		System.out.print("Inorder printing of tree --> ");
		printInorder(root);
		System.out.println();

		System.out.print("Postorder printing of tree --> ");
	    printPostorder(root);
	    System.out.println();


	    System.out.print("LevelOrder printing of tree --> ");
	    System.out.println();
	    printLevelOrder(root);

	}
}