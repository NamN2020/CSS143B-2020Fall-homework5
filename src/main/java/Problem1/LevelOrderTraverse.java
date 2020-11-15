package Problem1;
/*
    Nam Nguyen
    November 15, 2020
    CSS 143B
    Homework 5

    Interface: I choose LinkedList because that's the one I'm most familiar with.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> discoveredNodes = new LinkedList<TreeNode>();

        if (root == null) {
            return result;
        } else {
            discoveredNodes.add(root);
        }

        while (!discoveredNodes.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            int length = discoveredNodes.size();

            for (int i = 0; i < length; i++) {
                root = discoveredNodes.poll();
                tempList.add(root.val);

                // enqueue child nodes
                getChildNodes(discoveredNodes, root);
            }

            result.add(tempList);
        }
        return result;
    }

    public static void getChildNodes(Queue discoveredNodes, TreeNode root) {
        if (root.left != null) {
            discoveredNodes.add(root.left);
        }

        if (root.right != null) {
            discoveredNodes.add(root.right);
        }
    }
}
