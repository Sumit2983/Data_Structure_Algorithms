// ZigZagTreeTraversal
import java.util.*;
class ZigZagTreeTraversal { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<List<Integer>> zigzag(TreeNode r){List<List<Integer>>o=new ArrayList<>();if(r==null)return o;Queue<TreeNode>q=new ArrayDeque<>();q.add(r);boolean rev=false;while(!q.isEmpty()){int n=q.size();LinkedList<Integer>row=new LinkedList<>();for(int i=0;i<n;i++){TreeNode x=q.poll();if(rev)row.addFirst(x.val);else row.addLast(x.val);if(x.left!=null)q.add(x.left);if(x.right!=null)q.add(x.right);}o.add(row);rev=!rev;}return o;} }
