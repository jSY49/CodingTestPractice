class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {  
                sb.append(ch);
                continue;
            }

            if (Character.isUpperCase(ch)) {
                char moved = (char) (ch + n);
                if (moved > 'Z') moved -= 26;
                sb.append(moved);
            } else {
                
                char moved = (char) (ch + n);
                if (moved > 'z') moved -= 26;
                sb.append(moved);
            }
        }

        return sb.toString();
    }
}