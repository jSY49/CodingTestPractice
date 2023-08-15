class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(s,e+1));
        sb.reverse();
        my_string= my_string.replace(my_string.substring(s,e+1),sb.toString());
        return my_string;
    }
}