import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        return Arrays.stream(strings)
            .sorted(Comparator
                    .comparingInt((String s) -> s.charAt(n))    //기준 
                    .thenComparing(Comparator.naturalOrder())
                   )  //똑같으면 원래 단어 사전 순 
            .toArray(String[]::new);    // 다시 문자열 배열로 
    }
}