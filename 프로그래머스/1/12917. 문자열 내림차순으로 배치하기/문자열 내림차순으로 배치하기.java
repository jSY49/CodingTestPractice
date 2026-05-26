import java.util.*; 
class Solution {
    public String solution(String s) {
        
        String[] a = s.split("");
        Arrays.sort(a,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String t : a){
            sb.append(t);
        }
        return sb.toString();
    }
}