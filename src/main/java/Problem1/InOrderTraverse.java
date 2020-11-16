package Problem1;
/*
    Nam Nguyen
    November 15, 2020
    CSS 143B
    Homework 5
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {
        // homework
        List<Integer> result = new ArrayList<>();
        // hold TreeNodes so we can print them easier
        Stack<TreeNode> nodes = new Stack<TreeNode>();

        if (root == null) {
            return result;
        } else {
            nodes.push(root);
            root = root.left;
        }

        while (!nodes.isEmpty() || root != null) {
            // going to the farthest root.left
            while (root != null) {
                nodes.push(root);
                root = root.left;
            }
            // root is currently null since it got out of the while-loop
            // set root to the most recent valid value
            root = nodes.pop();
            result.add(root.val);

            // check right side of tree
            root = root.right;
        }

        return result;
    }
}
