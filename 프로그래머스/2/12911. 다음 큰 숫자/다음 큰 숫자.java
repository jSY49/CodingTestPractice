class Solution {
    public int solution(int n) {
        int answer = 0;
        int nBitCount = Integer.bitCount(n);
            
        while(answer==0){
            n++; 
            if(Integer.bitCount(n) == nBitCount ){
                answer = n;
            }
        }
        return answer;
    }
    
}