import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        int idx=0;
        while(i<arr.length){
            
            if(list.size()==0){
                list.add(arr[idx++]);
                i++;
            }
            else{
                if(list.get(list.size()-1)<arr[idx]){
                    list.add(arr[idx++]);
                    i++;
                }else{
                    list.remove(list.size()-1);
                }
            }
        }
        
        int[] stk =new int[list.size()];
        int k=0;
        for(int a : list)
            stk[k++]=a;
        return stk;
        
    }
}