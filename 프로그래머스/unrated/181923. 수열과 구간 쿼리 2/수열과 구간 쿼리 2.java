import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] ans = new int[queries.length];
        Arrays.fill(ans,Integer.MAX_VALUE);
        for(int i=0; i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            for(int j=s;j<=e;j++){
                if(arr[j]>k){
                    ans[i]=Math.min(arr[j],ans[i]);
                }
            }
            if(ans[i]==Integer.MAX_VALUE)
                ans[i]=-1;
        }
        return ans;
    }
}