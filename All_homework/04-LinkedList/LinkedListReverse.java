// LinkedListReverse
class LinkedListReverse { static class Node { int val; Node next; Node(int v){val=v;} } public Node reverse(Node h){Node prev=null,cur=h;while(cur!=null){Node n=cur.next;cur.next=prev;prev=cur;cur=n;}return prev;} }
