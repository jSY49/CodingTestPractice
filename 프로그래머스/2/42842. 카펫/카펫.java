class Solution {
    public int[] solution(int brown, int yellow) {
        //1. x * y = bro +yel 
        //2. bro = 2x + 2y -4 = 2*(x+y-2)
        //3. yel = xy - bro = xy - 2*(x+y-2) 
       
        int total = brown + yellow;

        for (int x = total; x >= 3; x--) {  //최소한 가로와 세로 3*3 이상  
            if (total % x == 0) { 
                int y = total / x;  
                if (2 * (x + y - 2) == brown) {
                    return new int[] {x, y}; 
                }
            }
        }
        
    return new int[]{};
    }
}