import java.util.*; 

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> qu = new PriorityQueue(Collections.reverseOrder());
        
        for(int a : works){
            qu.offer(a);
        }
        
        for(int i =0 ; i< n ; i++){
            
            int max=qu.poll(); 
            if(max <= 0) break; 
            
            max--; 
            qu.offer(max);   
            
        }
        
        for(int a : qu){
            answer += Math.pow(a,2);
        }
        return answer;
    }
}