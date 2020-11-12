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

        if(root == null){
            return null;
        } else {
            result.add(root.val);
            root = root.left;
        }

        while(!result.isEmpty()){
            result.add(root.val);
            root = root.left;
            if(root == null){

            }
        }

        return result;
    }
}
