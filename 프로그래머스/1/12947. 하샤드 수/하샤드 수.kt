class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().sumOf { it.toString().toInt() }
        // val sum2 = x.toString().map { it.toString().toInt() }.sum()
        return x%sum==0
    }
}