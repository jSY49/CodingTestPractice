class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        
        var max1 = 0 
        var max2 = 0
        
        sizes.forEach{ row ->
            row.sortDescending()
            max1 = Math.max(row[0],max1)
            max2 = Math.max(row[1],max2)
        }
        
        return max1*max2
    }
}