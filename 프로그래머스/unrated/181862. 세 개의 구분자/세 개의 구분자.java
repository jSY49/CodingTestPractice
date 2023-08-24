import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(String s : myStr.split("")){
            if(s.equals("a")||s.equals("b")||s.equals("c")){
                if(sb.length()!=0){
                    list.add(sb.toString());
                    sb.setLength(0);    
                }
            }else{
                sb.append(s);
            }
        }
        
        if(sb.length()!=0)
            list.add(sb.toString());
        if(list.size()==0)
            list.add("EMPTY");
        
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}