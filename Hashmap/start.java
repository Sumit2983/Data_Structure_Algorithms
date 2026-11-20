// in hashmap data is stored in key value pair
// a bucket is created for each key value pair and if we assign a new value to a paired key then the value of that key will be updated with the new value
// 2d matrix linkedlist stack ,priority , bitmasking


// put function , add function , 
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a : nums1){
            int sum = a+b;
            map.put(sum,map.getOrDefuault(sum,default)+1);
            
        }
    }
    
}

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );

        for (char c : map.keySet()) {
            pq.offer(c);
        }

        StringBuilder ans = new StringBuilder();

        while (!pq.isEmpty()) {
            char c = pq.poll();

            for (int i = 0; i < map.get(c); i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
