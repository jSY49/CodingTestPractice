class Solution {
    public String solution(int n, int t, int m, int p) {
        
       StringBuilder gameStr = new StringBuilder(); // 전체 문자열 
        StringBuilder answer = new StringBuilder();  // 튜브가 말해야 하는 답
        
        int currentNum = 0;
        
        // 넉넉하게 전체 문자열 생성 
        while (gameStr.length() < m * t) {
            gameStr.append(Integer.toString(currentNum, n).toUpperCase());
            currentNum++;
        }
        
        for (int i = p - 1; answer.length() < t; i += m) {
            answer.append(gameStr.charAt(i));
        }
        
        return answer.toString();
    }
}