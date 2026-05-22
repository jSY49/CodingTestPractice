import java.util.*; 

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> qu = new PriorityQueue<>(); 
        for(int a : scoville){
            qu.add(a);
        }
        
        while(qu.size()>1 && qu.peek()<K){
                int a = qu.poll();
                int b = qu.poll(); 
                
                qu.add(a+b*2);
                answer++; 
        }
        
        if(qu.peek()<K) answer = -1; 
         
        return answer;
    }
}