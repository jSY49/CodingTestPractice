class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        var num :Long = x.toLong()
        for(i in 1 .. n){
            answer= answer.plus(num.toLong())
            num+=x
        }
        
        return answer
    }
}