// SwappingNodesInLinkedList
class SwappingNodesInLinkedList {static class ListNode{int val;ListNode next;}public ListNode swapNodes(ListNode h,int k){ListNode a=h,b=h;for(int i=1;i<k;i++)a=a.next;ListNode kth=a;while(a.next!=null){a=a.next;b=b.next;}int t=kth.val;kth.val=b.val;b.val=t;return h;}}
