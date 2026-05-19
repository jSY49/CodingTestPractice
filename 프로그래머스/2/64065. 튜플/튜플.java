import java.util.*;
 
class Solution {
    public int[] solution(String s) {
        String sub = s.substring(2, s.length() - 2);
        String[] groups = sub.split("\\},\\{");
        String[][] sortedGroups = new String[groups.length + 1][];
        for (String group : groups) {
            String[] numbers = group.split(",");
            sortedGroups[numbers.length] = numbers;
        }
        
        ArrayList<Integer> result = new ArrayList<>(); 
        
        for(int i =1 ; i < sortedGroups.length; i++){
            
            String[] temp = sortedGroups[i];
            
            for(String a : temp){
                
                int num = Integer.parseInt(a);
                
                if(!result.contains(num)){
                    result.add(num);
                }
            }
        }
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);  
        }
        return answer;
    }
}