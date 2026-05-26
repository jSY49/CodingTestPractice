import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        int answer = 0;
        
        for(String tree : skill_trees){
            
            String left  = tree.replaceAll("[^"+skill+"]","");
            
            if (left.equals("")) {  // 기준 스킬 안배워도 true 
                answer++;
                continue; 
            }
            
            Queue<String> qu = new LinkedList<String>(Arrays.asList(left.split("")));
            Queue<String> skQu = new LinkedList<String>(Arrays.asList(skill.split("")));
            boolean isValid = true;
            while(!qu.isEmpty()){
                String sk = skQu.poll(); // poll로 미리 뽑아둠
                String temp = qu.poll(); 
    
                if(!sk.equals(temp)){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid){
                answer++; 
            }
            
        }
        
        return answer;
    }
}