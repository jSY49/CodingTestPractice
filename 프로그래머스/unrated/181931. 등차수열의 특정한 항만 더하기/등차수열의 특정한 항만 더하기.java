class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        for(boolean boo : included){
            
            if(boo){
                answer+=a;
            }
            a+=d;
        }
        
        return answer;
    }
}