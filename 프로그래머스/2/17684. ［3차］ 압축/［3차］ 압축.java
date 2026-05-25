import java.util.*;

class Solution {
    public int[] solution(String msg) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        Map<String,Integer> dict = new HashMap<>(); 
        
        for (char c = 'A'; c <= 'Z'; c++) {
            dict.put(Character.toString(c), dict.size() + 1);
        }
        
        int startIdx = 0;
        
        while (startIdx < msg.length()) {
            String cur = "";
            int printIdx = -1;
            int nextIdx = startIdx;
            
            while (nextIdx < msg.length()) {
                
                String nextStr = cur + msg.charAt(nextIdx);
                
                if (dict.containsKey(nextStr)) {
                    cur = nextStr;
                    printIdx = dict.get(cur);
                    nextIdx++;
                } else {
                    dict.put(nextStr, dict.size() + 1);
                    break;
                }
            }
            
            temp.add(printIdx);
            startIdx = nextIdx;
        }
        
        int[] answer = new int[temp.size()];
        for(int i =0 ; i< temp.size(); i++) answer[i] = temp.get(i);
        return answer;
    }
}