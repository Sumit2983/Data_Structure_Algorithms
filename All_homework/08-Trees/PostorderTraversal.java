// PostorderTraversal
import java.util.*;
class PostorderTraversal { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<Integer> postorder(TreeNode r){List<Integer>o=new ArrayList<>();go(r,o);return o;}private void go(TreeNode n,List<Integer>o){if(n==null)return;go(n.left,o);go(n.right,o);o.add(n.val);} }
