// ReverseLinkedListII
class ReverseLinkedListII {static class ListNode{int val;ListNode next;}public ListNode reverseBetween(ListNode h,int l,int r){ListNode d=new ListNode();d.next=h;ListNode p=d;for(int i=1;i<l;i++)p=p.next;ListNode cur=p.next;for(int i=0;i<r-l;i++){ListNode n=cur.next;cur.next=n.next;n.next=p.next;p.next=n;}return d.next;}}
