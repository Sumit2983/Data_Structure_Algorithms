// DailyTemperatures
class DailyTemperatures {public int[] dailyTemperatures(int[] t){int[]r=new int[t.length],st=new int[t.length];int top=-1;for(int i=0;i<t.length;i++){while(top>=0&&t[i]>t[st[top]]){int j=st[top--];r[j]=i-j;}st[++top]=i;}return r;}}
