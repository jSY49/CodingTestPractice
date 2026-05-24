class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] answer = new int[len];
        
        for(int i=0; i< len ; i++){
            int cnt= 0; 
            
            for(int k = i+1; k< len ; k++){
                
                cnt++;
                if(prices[i]>prices[k]){
                    break;
                }
            }
            
            answer[i] = cnt; 
        }
        return answer;
    }
}