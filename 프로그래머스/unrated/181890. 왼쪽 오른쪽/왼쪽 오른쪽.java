import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        int idx=0;
        String[] answer = new String[]{}; 
        for(String s :str_list ){
            if(s.equals("l")){
                answer= Arrays.copyOfRange(str_list,0,idx);
                break;
            }else if(s.equals("r")){
                answer= Arrays.copyOfRange(str_list,idx+1,str_list.length);
                break;
            }
            idx++;
        }
        
        return answer;
                
    }
}