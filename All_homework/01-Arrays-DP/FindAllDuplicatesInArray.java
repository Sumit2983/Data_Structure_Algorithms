// FindAllDuplicatesInArray
import java.util.*;
class FindAllDuplicatesInArray { public List<Integer> findDuplicates(int[] nums){List<Integer> r=new ArrayList<>();for(int x:nums){int i=Math.abs(x)-1;if(nums[i]<0)r.add(Math.abs(x));else nums[i]=-nums[i];}return r;} }
