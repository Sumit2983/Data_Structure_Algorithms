// CopyListWithRandomPointer
import java.util.*;
class CopyListWithRandomPointer { static class Node {int val;Node next,random;Node(int v){val=v;}} public Node copyRandomList(Node h){if(h==null)return null;Map<Node,Node>m=new HashMap<>();for(Node p=h;p!=null;p=p.next)m.put(p,new Node(p.val));for(Node p=h;p!=null;p=p.next){m.get(p).next=m.get(p.next);m.get(p).random=m.get(p.random);}return m.get(h);} }
