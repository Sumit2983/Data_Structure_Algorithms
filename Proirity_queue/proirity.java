package Data_Structure_Algorithms.Proirity_queue;

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
