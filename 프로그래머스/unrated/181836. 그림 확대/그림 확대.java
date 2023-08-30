class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        StringBuilder sb = new StringBuilder();
        int l=0;
        for(int i=0 ; i< picture.length;i++){
            for(int j=0; j<picture[i].length();j++){
                for(int q =0; q<k;q++)
                    sb.append(picture[i].charAt(j));
            }
            for(int q =0; q<k;q++)
                answer[l++]=sb.toString();
        
            sb.setLength(0);
        }
        
        return answer;
    }
}