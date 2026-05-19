class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        boolean isSmall = false; 
        
        
        while(!isSmall){
                
            isSmall = checkInit(wallet,bill);
            if(isSmall) break; 
            
            answer++;
            
            if(bill[0]>bill[1]){
                bill[0] = bill[0]/2;
            }else{
                bill[1] = bill[1]/2;
            }
            
        }
        
        return answer;
    }
    
    boolean checkInit(int[] wallet, int[] bill){
        
        //1. 원래대로 
        if(wallet[0]>=bill[0] && wallet[1] >= bill[1]){
            return true; 
        }
        
        //2. 90도 돌려서 
        if(wallet[0]>=bill[1] && wallet[1] >= bill[0]){
            return true; 
        }
        
        return false;
    }
}