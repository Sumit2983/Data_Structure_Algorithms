// LinkedListCycleII
class LinkedListCycleII {static class ListNode{int val;ListNode next;}public ListNode detectCycle(ListNode h){ListNode s=h,f=h;do{if(f==null||f.next==null)return null;s=s.next;f=f.next.next;}while(s!=f);s=h;while(s!=f){s=s.next;f=f.next;}return s;}}
