class Solution {
    public String solution(String my_string, String alp) {
       StringBuilder answer = new StringBuilder();
        
        String[] str = my_string.split("");
        for(String tmp : str){
            if(tmp.equals(alp))
                answer.append(tmp.toUpperCase());
            else
                answer.append(tmp);
        }
        
        
        return answer.toString();
    }
}