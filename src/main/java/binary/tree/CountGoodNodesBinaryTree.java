package binary.tree;

// https://leetcode.com/problems/count-good-nodes-in-binary-tree/
public class CountGoodNodesBinaryTree {
    // TC: O(n)
    // MC: O(n)

    int count = 0;
    public int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    void dfs(TreeNode node, int maxSoFar) {
        if (node == null) {
            return;
        }

        if (node.val >= maxSoFar) {
            count++;
            maxSoFar = node.val;
        }

        dfs(node.left, maxSoFar);
        dfs(node.right, maxSoFar);
    }

}
