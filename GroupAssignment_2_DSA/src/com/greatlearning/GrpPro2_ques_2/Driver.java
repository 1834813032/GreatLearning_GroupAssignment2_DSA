package com.greatlearning.GrpPro2_ques_2;

public class Driver {
	 Node node;
	    Node prev = null;
	    Node newHead = null;
	    void processBST(Node root)
	    {
	        if(root == null)return;
	        //loop till left leaf
	        processBST(root.left);
	        Node rightNode = root.right;
	        Node leftNode = root.left;
	        //update new head to hold new root
	        if(newHead == null)
	        {
	            newHead = root;
	            root.left = null;
	            prev = root;
	        }
	        else
	        {
	            //update the right of predecessor and also the predecessor to accomodate next node
	            prev.right = root;
	            root.left = null;
	            prev = root;
	        }
	        processBST(rightNode);
	    }  
	    void traverse(Node root)
	    {
	        //traverse till leaf
	        if(root == null)return;
	        System.out.print(root.val + " ");
	        traverse(root.right);       
	    }
	
	
	

	public static void main(String[] args) {
		 Driver tree = new Driver();
	        tree.node = new Node(50);
	        tree.node.left = new Node(30);
	        tree.node.right = new Node(60);
	        tree.node.left.left = new Node(10);
	        tree.node.right.left= new Node(55);
	        //utility method to transform bst to skewed tree
	        tree.processBST(tree.node);
	        //utility method to print the transformed data
	        tree.traverse(tree.newHead);

	}

}
