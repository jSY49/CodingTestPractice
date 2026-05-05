import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] answers) {
        
        int[][] patterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] scores = new int[patterns.length];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < patterns.length; j++) {
                if (answers[i] == patterns[j][i % patterns[j].length]) {
                    scores[j]++;
                }
            }
        }
        
        int max = Arrays.stream(scores).max().getAsInt(); 

        return IntStream.range(0,scores.length)
            .filter( i-> scores[i]== max)
            .map(i-> i+1)
            .toArray();
    }
}