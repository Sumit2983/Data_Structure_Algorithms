// InorderTraversalIterative
import java.util.*;
class InorderTraversalIterative { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<Integer> inorder(TreeNode r){List<Integer>o=new ArrayList<>();Deque<TreeNode>s=new ArrayDeque<>();TreeNode c=r;while(c!=null||!s.isEmpty()){while(c!=null){s.push(c);c=c.left;}c=s.pop();o.add(c.val);c=c.right;}return o;} }
