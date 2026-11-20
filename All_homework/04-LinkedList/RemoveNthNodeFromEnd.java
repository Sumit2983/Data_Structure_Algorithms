// RemoveNthNodeFromEnd
class RemoveNthNodeFromEnd {static class ListNode{int val;ListNode next;}public ListNode removeNthFromEnd(ListNode h,int n){ListNode d=new ListNode();d.next=h;ListNode a=d,b=d;for(int i=0;i<n;i++)a=a.next;while(a.next!=null){a=a.next;b=b.next;}b.next=b.next.next;return d.next;}}
