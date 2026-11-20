// AddToArrayForm
import java.util.*;
class AddToArrayForm { public List<Integer> addToArrayForm(int[] num,int k){ List<Integer> r=new ArrayList<>(); int i=num.length-1; while(i>=0||k>0){int sum=(i>=0?num[i--]:0)+k%10; r.add(sum%10); k=k/10+sum/10;} Collections.reverse(r); return r; } }
