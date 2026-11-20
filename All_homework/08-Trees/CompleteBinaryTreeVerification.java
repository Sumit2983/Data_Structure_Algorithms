// CompleteBinaryTreeVerification
import java.util.*;
class CompleteBinaryTreeVerification { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} public boolean isComplete(TreeNode r){if(r==null)return true;Queue<TreeNode>q=new ArrayDeque<>();q.add(r);boolean gap=false;while(!q.isEmpty()){TreeNode n=q.poll();if(n.left!=null){if(gap)return false;q.add(n.left);}else gap=true;if(n.right!=null){if(gap)return false;q.add(n.right);}else gap=true;}return true;} }
