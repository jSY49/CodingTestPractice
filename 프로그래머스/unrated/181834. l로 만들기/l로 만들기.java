class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        for(String alp : myString.split("")){
            if(alp.compareTo("l")<0)
                alp="l";
            answer.append(alp);
        }
        
        
        return answer.toString();
    }
}