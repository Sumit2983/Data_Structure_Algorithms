// RotateList
class RotateList {static class ListNode{int val;ListNode next;}public ListNode rotateRight(ListNode h,int k){if(h==null||h.next==null||k==0)return h;int n=1;ListNode t=h;while(t.next!=null){t=t.next;n++;}k%=n;if(k==0)return h;t.next=h;for(int i=0;i<n-k;i++)t=t.next;ListNode r=t.next;t.next=null;return r;}}
