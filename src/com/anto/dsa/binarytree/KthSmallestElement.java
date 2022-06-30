package com.anto.dsa.binarytree;

public class KthSmallestElement {
	
	static int count = 0;

	public static void main(String[] args) {

		Node root = null;
		int[] keys = { 20, 8, 22, 4, 12, 10, 14 };
		for (int x : keys)
			root = Node.insert(root, x);
		int k = 3;
		printKthSmallest(root, k);

	}

	public static void printKthSmallest(Node root, int k) {
		Node res = kthSmallest(root, k);
		if (res == null)
			System.out.println("There are less than k nodes in the BST");
		else
			System.out.println("K-th Smallest Element is " + res.data);
	}

	public static Node kthSmallest(Node root, int k)
    {
        // base case
        if (root == null)
            return null;
 
        // search in left subtree
        Node left = kthSmallest(root.left, k);
 
        // if k'th smallest is found in left subtree, return it
        if (left != null)
            return left;
 
        // if current element is k'th smallest, return it
        count++;
        if (count == k)
            return root;
 
        // else search in right subtree
        return kthSmallest(root.right, k);
    }
}
