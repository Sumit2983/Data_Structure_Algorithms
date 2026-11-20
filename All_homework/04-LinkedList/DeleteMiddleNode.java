// DeleteMiddleNode
class DeleteMiddleNode { static class Node { int val; Node next; Node(int v){val=v;} } public Node deleteMiddle(Node h){if(h==null||h.next==null)return null;Node s=h,f=h;while(f.next!=null&&f.next.next!=null){s=s.next;f=f.next.next;}s.next=s.next.next;return h;} }
