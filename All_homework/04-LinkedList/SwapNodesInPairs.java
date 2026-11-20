// SwapNodesInPairs
class SwapNodesInPairs {static class ListNode{int val;ListNode next;}public ListNode swapPairs(ListNode h){ListNode d=new ListNode();d.next=h;ListNode p=d;while(p.next!=null&&p.next.next!=null){ListNode a=p.next,b=a.next;a.next=b.next;b.next=a;p.next=b;p=a;}return d.next;}}
