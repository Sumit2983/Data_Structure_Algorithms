// BinaryTreeValidation
class BinaryTreeValidation { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public boolean isValidBST(TreeNode r){return check(r,Long.MIN_VALUE,Long.MAX_VALUE);}private boolean check(TreeNode n,long lo,long hi){if(n==null)return true;if(n.val<=lo||n.val>=hi)return false;return check(n.left,lo,n.val)&&check(n.right,n.val,hi);} }
