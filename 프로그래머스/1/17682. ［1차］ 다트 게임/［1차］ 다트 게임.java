import java.util.*; 

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        // S, D, T, *, # 문자가 등장한 바로 직후(뒤쪽 공간)를 기준으로 자른다!
        // String[] tokens = dartResult.split("(?<=[SDT*#])");
        // String[] tokens = dartResult.split("(?=[0-9]+)");    //(?=패턴)은 "이 패턴이 나오기 바로 직전 공간"
        String[] tokens = dartResult.split("(?=[0-9])(?<![0-9])");  // ?=앞에는 숫자고 ?<!뒤에는 숫자가 아닌 패턴 
        int[] scores = new int[3];
        int idx = 0;  
        
        for(String token : tokens){
                
            System.out.println(token);
            if (token.isEmpty()) continue;
            
            int score = Integer.parseInt(token.replaceAll("[^0-9]", ""));
            
            if (token.contains("S")) {
                score = (int) Math.pow(score, 1);
            } else if (token.contains("D")) {
                score = (int) Math.pow(score, 2);
            } else if (token.contains("T")) {
                score = (int) Math.pow(score, 3);
            }
            
            scores[idx] = score;
            
            if (token.contains("*")) {
                scores[idx] *= 2;
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (token.contains("#")) {
                scores[idx] *= -1;
            }
            idx++;
        }
        
        for (int s : scores) {
            answer += s;
        }
        return answer;
    }
}