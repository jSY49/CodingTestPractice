class Solution
{
    public int solution(int n, int a, int b)
    {
        int games = (int) (Math.log(n) / Math.log(2));  // 총 이루어 질 수 있는 게임 수 
        int answer = 0; 
        for(int i=1 ;i <=games ; i++ ){
            a = a%2 + a/2 ;
            b = b%2 + b/2 ;
            
            if(a==b){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
