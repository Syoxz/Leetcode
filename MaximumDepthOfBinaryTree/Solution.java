//package MaximumDepthOfBinaryTree;
//
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}
//
//
//public class Solution {
//    public static int maxDepth(TreeNode root) {
//        // Base Condition
//        if (root == null) return 0;
//        // Hypothesis
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//        // Induction
//        return Math.max(left, right) + 1;
//    }
//}
//
//
//class SolutionTest{
//    @Test
//    public void testMaxDepth (){
//        assertEquals (Solution.maxDepth(new TreeNode(), 2);
//    }
//}