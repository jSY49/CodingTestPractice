import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
    String answer = "";

        Map<String , Integer> map = new HashMap<>();
        for (String s : participant) {
            int cnt = map.getOrDefault(s, 0) + 1;
            map.put(s, cnt);
        }

        for (String s : completion) {
            int cnt = map.getOrDefault(s, 0) - 1;
            if (cnt <= 0) {
                map.remove(s);
                continue;
            }
            map.put(s,cnt);
        }

        for(String a : map.keySet()){
            answer =a ;
        }

        return answer;
    }
}