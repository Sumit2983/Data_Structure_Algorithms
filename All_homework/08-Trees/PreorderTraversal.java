// PreorderTraversal
import java.util.*;
class PreorderTraversal { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<Integer> preorder(TreeNode r){List<Integer>o=new ArrayList<>();go(r,o);return o;}private void go(TreeNode n,List<Integer>o){if(n==null)return;o.add(n.val);go(n.left,o);go(n.right,o);} }
