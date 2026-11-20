// RemoveDuplicatesSorted
class RemoveDuplicatesSorted { static class Node { int val; Node next; Node(int v){val=v;} } public Node remove(Node h){for(Node p=h;p!=null&&p.next!=null;)if(p.val==p.next.val)p.next=p.next.next;else p=p.next;return h;} }
