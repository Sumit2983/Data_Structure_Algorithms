// LinkedListSearchMiddle
class LinkedListSearchMiddle { static class Node { int val; Node next; Node(int v){val=v;} } public Node middle(Node h){Node s=h,f=h;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;}return s;} }
