import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        
        int box = score.length/m;
        int idx = score.length - 1; 
        for(int i =0 ; i < box; i++){
            
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j<m ; j++){
                
                min = Math.min(min,score[idx]);
                idx--; 
            }
            
            answer+= (min * m);
            
        }
        
        return answer;
    }
}

/*
4 4 4 = 12 
4 4 4 = 12 
2 2 2 = 6
2 1 1 = 3 

=> 33 

*/