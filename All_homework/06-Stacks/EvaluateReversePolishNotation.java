// EvaluateReversePolishNotation
import java.util.*;
class EvaluateReversePolishNotation {public int evalRPN(String[] t){Deque<Integer>s=new ArrayDeque<>();for(String x:t){if(x.equals("+" )||x.equals("-")||x.equals("*")||x.equals("/")){int b=s.pop(),a=s.pop();switch(x){case "+":s.push(a+b);break;case "-":s.push(a-b);break;case "*":s.push(a*b);break;default:s.push(a/b);}}else s.push(Integer.parseInt(x));}return s.pop();}}
