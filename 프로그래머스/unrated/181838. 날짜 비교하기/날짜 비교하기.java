class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = -1;
        for(int i=0 ; i<3; i++){
            if(date1[i]>date2[i]){
                answer = 0;
                break;
            }else if(date1[i]==date2[i]){
                answer =0;
            }else{
                answer =1;
                break;
            }
            
        }
        
        return answer;
    }
}