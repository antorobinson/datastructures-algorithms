package com.anto.dsa.binarytree;

public class Node {

	int data;
    Node left, right;
    
    Node(int x)
    {
        data = x;
        left = right = null;
    }
    
    public static Node insert(Node root, int x)
    {
        if (root == null)
            return new Node(x);
        if (x < root.data)
            root.left = insert(root.left, x);
        else if (x > root.data)
            root.right = insert(root.right, x);
        return root;
    }
    
    
}
