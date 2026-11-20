// NextGreaterElementII
class NextGreaterElementII {public int[] nextGreaterElements(int[] a){int n=a.length;int[]r=new int[n],st=new int[2*n];java.util.Arrays.fill(r,-1);int top=-1;for(int i=0;i<2*n;i++){int x=a[i%n];while(top>=0&&a[st[top]]<x)r[st[top--]]=x;if(i<n)st[++top]=i;}return r;}}
