// InorderTraversalList
import java.util.*;
class InorderTraversalList { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<Integer> inorderTraversal(TreeNode r){List<Integer>o=new ArrayList<>();go(r,o);return o;}private void go(TreeNode n,List<Integer>o){if(n==null)return;go(n.left,o);o.add(n.val);go(n.right,o);} }
