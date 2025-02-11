class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        
        for(i in left .. right){
            var count = getDivisorCount(i)
            if(count%2==0){
                answer+=i
            }else{
                answer-=i
            }
        }
        
        return answer
    }
    
    
    fun getDivisorCount(n: Int): Int {
    var count = 0
    for (i in 1..n) {
        if (n % i == 0) {
            count++
        }
    }
    return count
}
}

