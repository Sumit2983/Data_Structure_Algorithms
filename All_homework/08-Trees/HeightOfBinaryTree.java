// HeightOfBinaryTree
class HeightOfBinaryTree { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public int height(TreeNode r){return r==null?0:1+Math.max(height(r.left),height(r.right));} }
