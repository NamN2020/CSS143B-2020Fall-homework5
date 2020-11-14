package Problem2;
/*
    Nam Nguyen
    November 15, 2020
    CSS 143B
    Homework 5

    Sources: https://youtu.be/py3R23aAPCA
 */
import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        // homework
        // hint: pay attention to the assumptions of this problem.
        if(root == null){
            return null;
        } else if(root == p || root == q){
            return root;
        }

        TreeNode leftSearch = lowestCommonAncestor(root.left, p, q);
        TreeNode rightSearch = lowestCommonAncestor(root.right, p, q);


        if(leftSearch != null && rightSearch != null){
            return root;
        } else if(rightSearch == null){
            return leftSearch;
        } else {
            return rightSearch;
        }
    }
}
