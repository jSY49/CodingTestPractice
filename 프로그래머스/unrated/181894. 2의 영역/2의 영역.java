import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int cnt=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                cnt++;
                list.add(i);
            }   
        }
        if(cnt==0){ 
//             list.add(-1);
             return new int[]{-1};   
            }
        
        int[] answer =  Arrays.copyOfRange(arr, list.get(0),list.get(list.size()-1)+1);
    
        
        return answer;
    }
}