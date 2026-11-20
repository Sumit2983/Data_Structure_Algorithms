// OnlineStockSpan
import java.util.*;
class OnlineStockSpan {Deque<int[]>s=new ArrayDeque<>();int day=0;public int next(int price){int span=1;while(!s.isEmpty()&&s.peek()[0]<=price)span+=s.pop()[1];s.push(new int[]{price,span});day++;return span;}}
