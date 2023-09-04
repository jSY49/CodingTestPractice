import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
         Map<Character, Integer> map = new HashMap<>();

        int[] res = new int[targets.length];
        int result;

        for (String s : keymap) {
            for (int i = s.length() - 1; i >= 0; i--) {
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),Math.min(map.get(s.charAt(i)),i+1));
                }else
                    map.put(s.charAt(i), i + 1);
            }
        }

        for (int i = 0; i < targets.length; i++) {
            result = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (!map.containsKey(targets[i].charAt(j))) {
                    result = -1;
                    break;
                }
                result += map.get(targets[i].charAt(j));
            }
            res[i] = result;
        }

        return res;

    }
}