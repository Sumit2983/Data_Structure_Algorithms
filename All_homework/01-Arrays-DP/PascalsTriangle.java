// PascalsTriangle
import java.util.*;
class PascalsTriangle { public List<List<Integer>> generate(int n){ List<List<Integer>> a=new ArrayList<>(); for(int i=0;i<n;i++){List<Integer> row=new ArrayList<>(); for(int j=0;j<=i;j++) row.add(j==0||j==i?1:a.get(i-1).get(j-1)+a.get(i-1).get(j)); a.add(row);} return a;} }
