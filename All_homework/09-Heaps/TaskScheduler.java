// TaskScheduler
import java.util.*;
class TaskScheduler {public int leastInterval(char[]tasks,int n){int[]f=new int[26];for(char c:tasks)f[c-'A']++;Arrays.sort(f);int max=f[25]-1,slots=max*n;for(int i=24;i>=0&&f[i]>0;i--)slots-=Math.min(max,f[i]);return slots>0?slots+tasks.length:tasks.length;}}
