class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];
        answer++;
        
        for(int wall : section){
            if(start+m>wall){
                continue;   
            }
            
            start = wall;
            answer++;
        }
        
        return answer;
    }
}