// LinkedListCycle
class LinkedListCycle {static class ListNode{int val;ListNode next;}public boolean hasCycle(ListNode h){ListNode s=h,f=h;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;if(s==f)return true;}return false;}}
