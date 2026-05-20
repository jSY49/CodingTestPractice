class Solution {
    public int solution(String[] babbling) {
        String[] basic = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        
        for(int i = 0; i < babbling.length; i++){
            String temp = babbling[i];
            
            if(temp.contains("ayaaya") || temp.contains("yeye") || 
               temp.contains("woowoo") || temp.contains("mama")) {
                continue;  
            }
            
            for(int k = 0; k < basic.length; k++){
                if(temp.contains(basic[k])){
                    temp = temp.replace(basic[k], "-"); 
                }
            }
            
            if(temp.replace("-", "").length() <= 0){
                answer++;
            }
        }
        return answer;
    }
}