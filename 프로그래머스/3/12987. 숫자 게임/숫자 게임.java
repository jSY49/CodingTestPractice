import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;
        int i = 0; // A 포인터 (아직 못 이긴 가장 작은 A)

        for (int j = 0; j < B.length; j++) {
            if (i < A.length && B[j] > A[i]) {
                answer++;
                i++; // 이 A는 이겼으니 다음 A로
            }
            // 못 이기면 i는 그대로 두고, 이 B카드만 버려짐 (j만 증가)
        }

        return answer;
    }
}