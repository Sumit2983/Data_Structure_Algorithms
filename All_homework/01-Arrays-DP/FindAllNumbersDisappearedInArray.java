// FindAllNumbersDisappearedInArray
import java.util.*;
class FindAllNumbersDisappearedInArray { public List<Integer> findDisappearedNumbers(int[] nums){List<Integer> r=new ArrayList<>();for(int x:nums){int i=Math.abs(x)-1;if(nums[i]>0)nums[i]=-nums[i];}for(int i=0;i<nums.length;i++)if(nums[i]>0)r.add(i+1);return r;} }
