package Problem3;
/*
    Nam Nguyen
    November 15, 2020
    CSS 143B
    Homework 5
 */

import Problem1.TreeNode;

public class InsertInBST {
    public static void insert(TreeNode<Integer> root, int valToInsert) {
        // homework
        TreeNode val = new TreeNode(valToInsert);
        TreeNode<Integer> prevNode = new TreeNode(root);

        if(root == null){
            root = val;
        }

        while (root != null) {
            prevNode = root;        // hold prevNode since loop goes until root == null

            if (valToInsert > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }

        // insert node in correct position
        if (valToInsert > prevNode.val) {
            prevNode.right = val;
        } else if (valToInsert < prevNode.val) {
            prevNode.left = val;
        } else {    // if key == root, insert key either direction
            prevNode.left = val;
        }

    }
}
