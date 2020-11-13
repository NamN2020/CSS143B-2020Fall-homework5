package Problem1;
/*
    Nam Nguyen
    November 15, 2020
    CSS 143B
    Homework 5
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
        int count = 0;

        if (root == null) {
            return result;
        } else {
            count++;
            discoveredNodes.add(root);
        }

        while (!discoveredNodes.isEmpty()) {
            List<Integer> tempList = new ArrayList<>();
            root = discoveredNodes.poll();
            if (count < 2) {
                tempList.add(root.val);
            } else {
                for(int i = 1; i < count; i ++){
                    tempList.add(root.val);
                    if(discoveredNodes.peek() != null){
                        root = discoveredNodes.poll();
                    }
                }
                count = 1;
            }
            result.add(tempList);

            // enqueue the child nodes
            if (root.left != null) {
                discoveredNodes.add(root.left);
                count++;
            }

            if (root.right != null) {
                discoveredNodes.add(root.right);
                count++;
            }

        }
        return result;
    }
}
