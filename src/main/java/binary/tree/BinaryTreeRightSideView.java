package binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-right-side-view/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class BinaryTreeRightSideView {

    // TC: O(n)
    // MC: O(n)
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> rightNodes = new ArrayList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if (i == length - 1) {
                    rightNodes.add(node.val);
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }

        }

        return rightNodes;
    }

}
