import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        
        for(String str : intStrs){
            String tmp = str.substring(s,s+l);
            if(Integer.parseInt(tmp)>k)
                list.add(Integer.parseInt(tmp));
        }
        
        int[] ans = new int[list.size()];
        int idx=0;
        for(int a : list)
            ans[idx++]=a;
        return ans;
    }
}