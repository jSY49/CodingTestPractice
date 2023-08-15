class Solution {
    public String solution(int q, int r, String code) {
        StringBuffer sb = new StringBuffer();
        int idx=0;
        for(char ch : code.toCharArray())
            if(idx++%q==r) sb.append(ch);
        
        return sb.toString();
    }
}