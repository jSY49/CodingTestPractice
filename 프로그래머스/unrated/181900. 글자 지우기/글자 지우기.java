class Solution {
    public String solution(String my_string, int[] indices) {
        String[] ans = my_string.split("");
        for(int idx : indices)
            ans[idx]="";
        
        return String.join("",ans);
    }
}