// InsertionSortList
class InsertionSortList {static class ListNode{int val;ListNode next;ListNode(int v){val=v;}}public ListNode insertionSortList(ListNode h){ListNode d=new ListNode(0);while(h!=null){ListNode n=h.next,p=d;while(p.next!=null&&p.next.val<=h.val)p=p.next;h.next=p.next;p.next=h;h=n;}return d.next;}}
