import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();
        int tmp=-1;
        for(int a : arr){
            if(tmp!= a) {
                list.add(a);
                tmp = a;
            }else
                continue;
        }
        
       int[] answer = new int[list.size()];
        for(int i=0 ; i<list.size();i++)
            answer[i]=list.get(i);

        return answer;
    }
}