// LevelOrderTraversal
import java.util.*;
class LevelOrderTraversal { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public List<List<Integer>> levelOrder(TreeNode r){List<List<Integer>>out=new ArrayList<>();if(r==null)return out;Queue<TreeNode>q=new ArrayDeque<>();q.add(r);while(!q.isEmpty()){int n=q.size();List<Integer>row=new ArrayList<>();for(int i=0;i<n;i++){TreeNode x=q.poll();row.add(x.val);if(x.left!=null)q.add(x.left);if(x.right!=null)q.add(x.right);}out.add(row);}return out;}
