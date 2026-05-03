class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        
        int idx=0;
        for(long k=left ; k<= right ;k++){
            long row = k/n;
            long col = k%n;
            long max = Math.max(row,col);
            answer[idx++] = (int)max+1;
        }
        
        return answer;
    }
}