class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        int idx=0;
        for(int[] a : parts){
            sb.append(my_strings[idx++].substring(a[0],a[1]+1));
        }
        
        return sb.toString();
    }
}