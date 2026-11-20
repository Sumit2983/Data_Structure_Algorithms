// LinkedListCount
class LinkedListCount { static class Node { int val; Node next; Node(int v){val=v;} } public int count(Node h){int c=0;for(Node p=h;p!=null;p=p.next)c++;return c;} }
