class Solution {
    boolean solution(String s) {
        
        int cnt = 0 ; 
        for(char ch : s.toCharArray()){
            if(ch == '('){
                cnt++;
            }else{
                cnt--;
            }
            
            if(cnt<0) break;
        }
        return cnt==0;
    }
}