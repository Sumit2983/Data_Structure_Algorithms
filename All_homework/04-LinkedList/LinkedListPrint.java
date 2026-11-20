// LinkedListPrint
class LinkedListPrint { static class Node { int val; Node next; Node(int v){val=v;} } public void print(Node h){for(Node p=h;p!=null;p=p.next)System.out.print(p.val+" ");System.out.println();} }
