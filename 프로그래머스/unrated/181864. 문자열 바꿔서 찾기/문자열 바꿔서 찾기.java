class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder str = new StringBuilder();
        for(int i=0 ; i<myString.length();i++){
            if(myString.charAt(i)=='A')
                str.append('B');
            else if(myString.charAt(i)=='B')
                str.append('A');
            else 
                str.append(myString.charAt(i));
        }
        
        if(str.toString().contains(pat)) answer =1;
        return answer;
    }
}