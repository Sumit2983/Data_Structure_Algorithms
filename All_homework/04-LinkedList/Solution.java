// Solution
// Generic linked-list utility solution: remove all nodes matching a value.
class Solution {static class Node{int val;Node next;Node(int x){val=x;}}public Node removeValue(Node h,int target){Node d=new Node(0);d.next=h;Node p=d;while(p.next!=null){if(p.next.val==target)p.next=p.next.next;else p=p.next;}return d.next;}}
