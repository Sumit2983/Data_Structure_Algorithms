// NthNodeFromEnd
class NthNodeFromEnd { static class Node { int val; Node next; Node(int v){val=v;} } public Node nthFromEnd(Node h,int n){Node a=h,b=h;for(int i=0;i<n;i++){if(a==null)return null;a=a.next;}while(a!=null){a=a.next;b=b.next;}return b;} }
