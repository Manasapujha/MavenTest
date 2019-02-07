package com.journaldev.datastructures;

import java.util.Stack;

import javax.swing.tree.TreeNode;

public class BinaryTreeTraversals
{
    /*
     * Steps on PreOrder traversal algorithm
     * visit the node
     * visit the left subtree
     * visit the right subtree
     */

    public void preOrderWithoutRecursion()
    {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty())
        {
            TreeNode current = nodes.pop();
            System.out.printf("%s ", current.data);
            if (current.right != null)
            {
                nodes.push(current.right);
            }
            if (current.left != null)
            {
                nodes.push(current.left);
            }
        }
    }

    private void preOrder(TreeNode node)
    {
        if (node == null)
        {
            return;
        }
        System.out.printf("%s ", node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    /*
     * visit left node
     * print value of the root
     * visit right node
     */
    private void inOrder(TreeNode node)
    {
        if (node == null)
        {
            return;
        }
        inOrder(node.left);
        System.out.printf("%s ", node.data);
        inOrder(node.right);
    }

    public void inOrder()
    {
        inOrder(root);
    }

    public void postOrderWithoutRecursion()
    {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty())
        {
            TreeNode current = nodes.peek();
            if (current.isLeaf())
            {
                TreeNode node = nodes.pop();
                System.out.printf("%s ", node.data);
            }
            else
            {
                if (current.right != null)
                {
                    nodes.push(current.right);
                    current.right = null;
                }
                if (current.left != null)
                {
                    nodes.push(current.left);
                    current.left = null;
                }
            }
        }
    }

}
