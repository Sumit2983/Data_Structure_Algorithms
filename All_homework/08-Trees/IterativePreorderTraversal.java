// IterativePreorderTraversal
import java.util.*;
class IterativePreorderTraversal { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<Integer> preorder(TreeNode r){List<Integer>o=new ArrayList<>();if(r==null)return o;Deque<TreeNode>s=new ArrayDeque<>();s.push(r);while(!s.isEmpty()){TreeNode n=s.pop();o.add(n.val);if(n.right!=null)s.push(n.right);if(n.left!=null)s.push(n.left);}return o;} }
