// DecodeString
import java.util.*;
class DecodeString {public String decodeString(String s){Deque<Integer>nums=new ArrayDeque<>();Deque<StringBuilder>parts=new ArrayDeque<>();StringBuilder cur=new StringBuilder();int n=0;for(char c:s.toCharArray()){if(Character.isDigit(c))n=n*10+c-'0';else if(c=='['){nums.push(n);parts.push(cur);cur=new StringBuilder();n=0;}else if(c==']'){StringBuilder prev=parts.pop();int k=nums.pop();for(int i=0;i<k;i++)prev.append(cur);cur=prev;}else cur.append(c);}return cur.toString();}}
