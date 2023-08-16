class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char a : my_string.toCharArray()){
            if(Character.isUpperCase(a))
                answer[a-'A']++;
            else
                answer[a-'A'-6]++;
                
        }
        
        return answer;
    }
}