import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            list.add(n);
        }
        
        int[] ans = new int[list.size()];
        int i=0;
        for(int a : list)
            ans[i++]=a;
        
        return ans;
    }
}