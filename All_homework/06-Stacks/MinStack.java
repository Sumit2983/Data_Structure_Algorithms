// MinStack
import java.util.*;
class MinStack {private Deque<Integer>s=new ArrayDeque<>(),m=new ArrayDeque<>();public void push(int x){s.push(x);if(m.isEmpty()||x<=m.peek())m.push(x);}public void pop(){int x=s.pop();if(x==m.peek())m.pop();}public int top(){return s.peek();}public int getMin(){return m.peek();}}
