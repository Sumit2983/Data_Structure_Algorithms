// NodeCountCalculation
class NodeCountCalculation { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public int count(TreeNode r){return r==null?0:1+count(r.left)+count(r.right);} }
