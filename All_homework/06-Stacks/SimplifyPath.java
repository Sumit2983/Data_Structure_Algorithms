// SimplifyPath
import java.util.*;
class SimplifyPath {public String simplifyPath(String p){Deque<String>s=new ArrayDeque<>();for(String x:p.split("/")){if(x.isEmpty()||x.equals("."))continue;if(x.equals("..")){if(!s.isEmpty())s.removeLast();}else s.addLast(x);}return "/"+String.join("/",s);}}
