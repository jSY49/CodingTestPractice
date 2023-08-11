import java.util.*;
class Solution {
    public int solution(int n, String control) {
        int res = n;
        Map<Character,Integer> map = Map.of(
            'w',1,
            's',-1,
            'd',10,
            'a',-10
        );
        
        for(char c :control.toCharArray()){
            res += (map.get(c));
        }
        return res;
    }
}