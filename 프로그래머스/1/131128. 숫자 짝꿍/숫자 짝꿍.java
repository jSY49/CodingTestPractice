class Solution {
    public String solution(String X, String Y) {
        
        String answer = "";
        
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        for (char c : X.toCharArray()) countX[c - '0']++;
        for (char c : Y.toCharArray()) countY[c - '0']++;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9 ; i>= 0 ; i--){
            int common  = Math.min(countX[i],countY[i]);
            for(int k = 0 ; k< common; k++){
                sb.append(i);
            }
        }
        
        answer = sb.toString();
        // System.out.println("★결과값 확인★: [" + answer + "]");
        if (answer.isEmpty()) return "-1";  
        if (answer.startsWith("0")) return "0";  
        
        return answer;
    }
}