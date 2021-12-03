package com.drakemayo;

public class Tree {
    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void insertReverse(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insertReverse(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    // Gets the node with the minimum value in the tree
    public Node getMin()
    {
        Node node = root;
        Node current = node;

        while (current.leftChild != null)
        {
            current = current.leftChild;
        }

        return current;
    }

    // Gets the node with the maximum value in the tree
    public Node getMax()
    {
        Node node = root;
        Node current = node;

        while (current.rightChild != null)
        {
            current = current.rightChild;
        }

        return current;
    }

    // Traverses the tree using the in-order method but in descending order.
    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderDescending();
        }
    }
}
