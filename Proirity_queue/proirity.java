package Data_Structure_Algorithms.Proirity_queue;
// 215 :-
public class proirity {
    function(int[] nums,int k){
        PriorityQueue<Integer> pq = new PritrityQueue<>();
        for(int num:nums){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(Atring[] args)
}

// 347:-
Map<Integer,Integer> freq = new HashMap<>();
for(int num:nums){
    freq.put(num,freq.getOrDefault(num,0)+1);
}
PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));

for(int nums:freq.keySet()){
    pq.add(num);
    if(pq.size()>k){
        pq.poll();
    }
    int[] res = new int[k];
    for(int i=0;i<k;i++){
        res[i]=pq.poll();
    }
    return res;
}
