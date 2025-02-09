class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer  = arr.filter{
            it%divisor == 0 
        }.toIntArray().sortedArray()
        
        if(answer.isEmpty()) return  intArrayOf(-1)
        return answer
    }
}