class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String lowerS = s.toLowerCase();
        
        boolean isFirst = true;

        for (char c : lowerS.toCharArray()) {
            if (c == ' ') {
                answer.append(c);
                isFirst = true;
            } 
            else if (isFirst) {
                answer.append(Character.toUpperCase(c));
                isFirst = false; 
            } 
            else {
                answer.append(c);
            }
        }

        return answer.toString();
    }
}