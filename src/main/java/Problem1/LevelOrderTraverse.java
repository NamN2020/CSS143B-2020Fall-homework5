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

        if(root == null){
            return result;
        } else {
           discoveredNodes.add(root);
        }

        while(!discoveredNodes.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            temp.add((int) discoveredNodes.poll().val);
            result.add(temp);

            if(root.left != null){
                discoveredNodes.add(root.left);
            }

            if(root.right != null){
                discoveredNodes.add(root.right);
            }

        }


        return result;
    }
}
