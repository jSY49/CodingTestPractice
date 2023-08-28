class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = -1;
        for(int i=0 ; i<3; i++){
            if(date1[i]>date2[i]){
                answer = (answer==1)? 1:0;
                break;
            }else if(date1[i]==date2[i]){
                answer = (answer==1)? 1:0;
            }else{
                answer =1;
            }
            
        }
        
        return answer;
    }
}