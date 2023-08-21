class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        
        myString = myString.toLowerCase();
        for(char ch : myString.toCharArray()){
            if(ch=='a')
                answer.append(Character.toUpperCase(ch));
            else
                answer.append(ch);
        }
        
        
        return answer.toString();
    }
}