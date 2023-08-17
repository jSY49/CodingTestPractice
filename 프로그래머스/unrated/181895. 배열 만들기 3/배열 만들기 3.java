import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<intervals.length;i++){
            for(int a : Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1]+1))
                list.add(a);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size();i++)
            answer[i]=list.get(i);
        return answer;
    }
}