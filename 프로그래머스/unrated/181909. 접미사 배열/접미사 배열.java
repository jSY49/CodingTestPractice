import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        
        List<String> list = new ArrayList<>();
        
        for(int i=0 ;i<my_string.length();i++){
            list.add(my_string.substring(i));
        }
        
        Collections.sort(list);
        
        int idx=0;
        String[] answer = new String[list.size()];
        for(String a : list){
            answer[idx++]=a;
        }
    
        return answer;
    }
}