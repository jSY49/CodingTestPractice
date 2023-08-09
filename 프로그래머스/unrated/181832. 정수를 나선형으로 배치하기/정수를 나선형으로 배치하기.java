class Solution {
    public int[][] solution(int n) {
        int[][] ans = new int[n][n];
        int idx=1;
        int rStart=0,cStart=0;
        int rEnd=n-1,cEnd=n-1;
        
        while(idx<=n*n){
            //→
            for(int i = cStart;i<=cEnd;i++) ans[rStart][i]=idx++;
            rStart++;
            //↓
            for(int i = rStart;i<=rEnd;i++) ans[i][cEnd]=idx++;
            cEnd--;
            //←
            for(int i = cEnd;i>=cStart;i--) ans[rEnd][i]=idx++;
            rEnd--;
            //↑
            for(int i = rEnd;i>=rStart;i--) ans[i][cStart]=idx++;
            cStart++;
            
        }
        
        return ans;
    }
}