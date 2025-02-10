class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        var min = Int.MAX_VALUE
        for (i in arr.indices) {
            if(arr[i]<min){
                min = arr[i]
            }
        }

        
        answer.remove(min)
        if(answer.size<=0){
            return intArrayOf(-1)
        }
        return answer.toIntArray()
    }
}