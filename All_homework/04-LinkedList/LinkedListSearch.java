// LinkedListSearch
class LinkedListSearch { static class Node { int val; Node next; Node(int v){val=v;} } public int search(Node h,int x){int i=0;for(Node p=h;p!=null;p=p.next,i++)if(p.val==x)return i;return -1;} }
