class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 != 0) answer++; 
                if (i * i != n && (n / i) % 2 != 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}