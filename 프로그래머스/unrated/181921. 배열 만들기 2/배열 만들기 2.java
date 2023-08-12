import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=l;i<=r;i++){
            if(i%5!=0)
                continue;
            String tmp = Integer.toString(i);
            boolean flag=false;
            for(char c : tmp.toCharArray()){
                if(c=='5'||c=='0'){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
            }
            if(flag)
                list.add(i);
            
        }
        
        if(list.size()==0) 
            list.add(-1);
        
        int[] res = new int[list.size()];
        int k=0;
        for(int a : list)
            res[k]=list.get(k++);
        return res;
    }
}