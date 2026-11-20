// ConstructBinaryTreeFromPreorderAndInorder
import java.util.*;
class ConstructBinaryTreeFromPreorderAndInorder { static class TreeNode{int val;TreeNode left,right;TreeNode(int v){val=v;}} int idx;Map<Integer,Integer>pos;public TreeNode buildTree(int[]pre,int[]in){idx=0;pos=new HashMap<>();for(int i=0;i<in.length;i++)pos.put(in[i],i);return build(pre,0,in.length-1);}private TreeNode build(int[]p,int l,int r){if(l>r)return null;int v=p[idx++];TreeNode n=new TreeNode(v);int m=pos.get(v);n.left=build(p,l,m-1);n.right=build(p,m+1,r);return n;} }
